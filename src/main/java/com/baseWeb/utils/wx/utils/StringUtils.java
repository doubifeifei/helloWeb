package com.baseWeb.utils.wx.utils;

import java.io.IOException;
import java.io.InputStream;

public class StringUtils {
    /**
     * 对字符串左补充目标串
     *
     * @param src    源字符串
     * @param target 目标字符串
     * @param length 结果字符串长度
     * @return
     */
    public static String appendLeftSub(String src, int length, String target) {
        StringBuffer sb = new StringBuffer();
        if (src != null && target != null) {
            int a = (length - src.length()) / target.length();
            int b = (length - src.length()) % target.length();
            if (src.length() <= length) {
                for (int i = 0; i < (b != 0 ? a + 1 : a); i++) {
                    sb.append(target);
                }
            }
            sb.append(src);
            return sb.substring(sb.length() - length);
        }
        return null;
    }

    /**
     * 判断字符串是否为空
     *
     * @param src
     * @return
     * @author lishen
     * @date 2015-5-1
     */
    public static boolean isEmpty(String src) {
        if (src == null || src.length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 求子串在父串中出现的次数
     * 使用此方法后，请及时清除count的值为0,count为全局变量，
     *
     * @auther lishen
     * @date 2015-7-30
     */
    public static int repeatCount(String parent, String children) {
        int count = 0;
        int length = parent.indexOf(children);
        while (length != -1) {
            parent = parent.substring(length + children.length());
            count++;
            length = parent.indexOf(children);
        }
        return count;
    }

    public static String inputStream2String(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1; ) {
            out.append(new String(b, 0, n));
        }
        return out.toString();
    }

    public static boolean checkStr(String accessToken) {
        return accessToken==null?false:accessToken.length()>0;
    }
}
