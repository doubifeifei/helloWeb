package com.baseWeb.entity.goods;

public class CommonConstant {
	public static final String MEMCACHE_PREFIX_KEY = "NXMALL_CACHE_";

	public static final String TOKEN_COOKIE_NAME = "ticketCookie";

	
	public static final String CURR_USER_INFO_OBJ = "userInfoObj";
	
	public static final String TOKEN_TYPE= "tokenType";
	// public static final String CURR_USER_BOID = "userBoId";
	//
	// public static final String CURR_USER_INFO = "userInfo";
	//
	// public static final String CURR_USER_LNG = "userLng";
	//
	// public static final String CURR_USER_LAT = "userLat";
	/**
	 * 表单重复提交
	 */
	public static final String SESSION_FORM_TOKEN_KEY = "token_key";
	
	/**
	 * 表单token属性
	 */
	public static final String FORM_TOKEN_KEY = "token";
	
	/**
	 * 重置session中的TOKEN值
	 */
	public static final String RESET_SESSION_TOKEN_KEY = "reset_token";
	/**
	 * session中的qlw值(企联网)
	 */
	public static final String RESET_SESSION_SHOW_KEY = "show_key";
	/**
	 * session中的店铺类型
	 */
	public static final String RESET_SESSION_SHOP_TYPE = "shop_type";
	
	/**
	 * 判断标准 是1
	 */
	public static final int JUDGE_FLAG_YES = 1;
	
	/**
	 * 判断标准 否 0
	 */
	public static final int JUDGE_FLAG_NO = 0;
	
	/**
	 * 用与判断用户的地图级别是否小于7
	 */
	public static final Integer RANKMAP=7;
	
	public static final String DELIMITER=":";
	public static final String DATE_FORMAT_TYPE_EN_TIME = "yyyyMMddHHmm";

	/**
	 * 订单信息缓存时间
	 */
	public static final int REDIS_ORDER_TIMEOUT_LEN = 20;

	/**
	 * 订单信息缓存时间
	 */
	public static final int REDIS_ORDER_BALANCE_TIMEOUT_LEN = 70;

	/**
	 * 管理编号超时时长
	 */
	public static final int REDIS_MANAGER_NO_TIMEOUT_LEN = 120;

	/**
	 * 判断用户白名单标准 是1
	 */
	public static final Integer USER_WHITE_YES = 1;

	/**
	 * 店铺业务类型
	 */
	public static final String DATA_DICTIONARY_SHOP_BUSINESS_TYPE = "SHOP_BUSINESS_TYPE";

	/**
	 * 线上演示用户
	 */
	public static final Integer SYSTEM_ROLE_IS_DEMO = 1;
	
	/**
	 * error key
	 */
	public static final String ERROR_KEY = "error";
	
	/**
	 * 404 key
	 */
	public static final int ERROR_404 = 404;

	/**商城系统ID*/
	public static final String SC_SYSTEM_ID = "20";
	/**猪交所系统ID*/
	public static final String ZJS_SYSTEM_ID = "18";

	public static final String TEMPLATE_ID = "2017120611020";
	
	public static final String MATERIAL_SELLER_CONFIRM_BOOK = "2017122116020"; //原料贷卖家确认书

	public static final Byte IS_SHIELD_PEER_INFO=1;

	//企联网访问
	public static final String QLW_ACCESS= "qlwAccess";
}
