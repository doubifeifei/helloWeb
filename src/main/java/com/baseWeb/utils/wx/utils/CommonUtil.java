package com.baseWeb.utils.wx.utils;


import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.baseWeb.utils.wx.WeiXinConstant;
import com.baseWeb.utils.wx.entity.AccessToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhanghongyue
 * @创建日期:2016-9-22
 */
public class CommonUtil {
    private static Logger log = LoggerFactory.getLogger(CommonUtil.class);
    // 凭证获取（GET）
    public final static String accessToken_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx9c526dccf5f37ffa&secret=65bb1ab7e2155467847ccf4a09b8976b";
    private static final String ACCESS_TOKEN = "ACCESS_TOKEN";

    /**
     * 发送https请求
     *
     * @param requestUrl    请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr     提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject httpsRequest(String requestUrl,
                                          String requestMethod, String outputStr) {
        log.info("__https:" + requestUrl);
        JSONObject jsonObject = null;
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = {new SslUtil.miTM()};
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);

            // 当outputStr不为null时向输出流写数据
            if (null != outputStr) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }

            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(
                    inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(
                    inputStreamReader);
            String str = null;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }

            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            conn.disconnect();
            if(buffer.toString()!=null){
            	jsonObject = JSONObject.parseObject(buffer.toString());
            	log.info("buffer.toString()"+buffer.toString());
            }else{
            	jsonObject = null;
            }

        } catch (ConnectException ce) {
            log.error("连接超时：{}", ce);
        } catch (Exception e) {
            log.error("https请求异常：{}", e);
        }
        return jsonObject;
    }

    public static String getRespContentFromWXByHttp(String wxUrl, String method, String mediaId) {
        FileOutputStream out = null;
        InputStream in = null;
        try {
            String dir = System.getProperty("user.dir") + WeiXinConstant.WX_UPLOAD_FILE_PATH + File.separator;
            log.info("dir:" + dir);
            if (!new File(dir).exists()) {// 创建本地服务器文件夹
                Boolean bl = new File(dir).mkdirs();
                log.info("创建上传文件夹!" + dir + "bl:" + bl);
            }
            URL url = new URL(wxUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestMethod(method);
            conn.connect();
            log.info("_____请求状态码:" + conn.getResponseCode());
            in = conn.getInputStream();
            // 获取微信文件名
            String picName = "";
            String contentDisposition = conn.getHeaderField("Content-Disposition");
            log.info("从微信端下载图片信息为:类型为" + conn.getContentType() + ",大小:" + conn.getContentLength());
            if (StringUtils.checkStr(contentDisposition)) {
                Pattern p = Pattern.compile("[\"\\?!:'<>]");// 增加对应的标点
                Matcher m = p.matcher(contentDisposition.split("filename=")[1]);
                picName = m.replaceAll("");
            }
            log.info("_+___" + picName);
            String fileName = "";
            if (StringUtils.checkStr(picName)) {
                fileName = dir + picName;
            } else {
                fileName = dir + mediaId + ".jpg";
            }
            out = new FileOutputStream(fileName);
            int len = 0;
            byte[] b = new byte[1024];
            if (in != null) {
                while ((len = in.read(b)) != -1) {
                    out.write(b, 0, len);
                }
            }
            log.info("文件本地下载完毕!" + fileName);
            return fileName;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("上传微信图片失败：" + e.getMessage());
            return null;
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                log.error("上传微信图片失败：" + e.getMessage());
            }

        }
    }

    /**
     * 获取接口访问凭证
     *
     * @return
     */
    public static AccessToken getAccessToken() {
        AccessToken accessToken = null;
        // 发起GET请求获取凭证
        JSONObject jsonObject = httpsRequest(accessToken_url, "GET", null);
        if (null != jsonObject) {
            try {
                accessToken = new AccessToken();
                accessToken.setAccessToken(jsonObject.getString("access_token"));
                accessToken.setTokenExpires(jsonObject.getInteger("expires_in"));
            } catch (JSONException e) {
                accessToken = null;
                // 获取accessToken失败
                log.error("获取accessToken失败 errcode:{} errmsg:{}", jsonObject.getInteger("errcode"), jsonObject.getString("errmsg"));
            }
        }
        return accessToken;
    }


    /**
     * 获取ticket
     *
     * @param accessToken
     * @return ticket
     */
    public static String getJSTicket(String accessToken) {
        String urlStr = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?type=jsapi&access_token=" + accessToken;
        JSONObject obj = CommonUtil.httpsRequest(urlStr, "GET", null);
        String ticket = obj.getString("ticket");
        return ticket;
    }

    /**
     * 获取AccessToken
     *
     * @param
     * @return AccessToken
     */
    public static AccessToken getAccessTokens() throws Exception {
        Map<String, AccessToken> weixinTokenMap = AccessToken.getWeixinTokenMap();
        AccessToken weixinTokenVo = null;
        if (null != weixinTokenMap) {
            weixinTokenVo = weixinTokenMap.get(ACCESS_TOKEN);
        } else {
            weixinTokenMap = new HashMap<String, AccessToken>();
        }
        String accessToken = "";
        //判断是否在有效期内
        if (null != weixinTokenVo && (System.currentTimeMillis() - weixinTokenVo.getTokenTime()) < weixinTokenVo.getTokenExpires() * 1000) {
            accessToken = weixinTokenVo.getAccessToken();
        }
        //判断accessToken为空 重新获取
        if (!StringUtils.checkStr(accessToken)) {
            if (null == weixinTokenVo) {
                weixinTokenVo = new AccessToken();
            }
            AccessToken at = CommonUtil.getAccessToken();
            accessToken = at.getAccessToken();
            weixinTokenVo.setAccessToken(accessToken);
            weixinTokenVo.setTokenTime(System.currentTimeMillis());
            weixinTokenVo.setTokenExpires(6500);
        }
        weixinTokenMap.put(ACCESS_TOKEN, weixinTokenVo);
        AccessToken.setWeixinTokenMap(weixinTokenMap);
        return weixinTokenVo;
    }

    /**
     * 发送https请求
     *
     * @param requestUrl    请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject httpsRequest(String requestUrl,
                                          String requestMethod) {
        return httpsRequest(requestUrl, requestMethod, null);
    }
    /**
     * URL编码（utf-8）
     * 
     * @param source
     * @return
     */
    public static String urlEncodeUTF8(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
