package com.baseWeb.entity.weixin;

import java.util.Map;

/**
 * @author zhanghongyue
 * @创建日期:2016-9-24
 */
public class AccessToken {
	private String accessToken;
	//有效期
	private long tokenExpires;
	//时间
	private long tokenTime;
	
	private String jsapiTicket;
	//有效期
	private long ticketExpires;
	//时间
	private long ticketTime;
	
	private static Map<String,AccessToken> weixinTokenMap;

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the tokenExpires
	 */
	public long getTokenExpires() {
		return tokenExpires;
	}

	/**
	 * @param tokenExpires the tokenExpires to set
	 */
	public void setTokenExpires(long tokenExpires) {
		this.tokenExpires = tokenExpires;
	}

	/**
	 * @return the tokenTime
	 */
	public long getTokenTime() {
		return tokenTime;
	}

	/**
	 * @param tokenTime the tokenTime to set
	 */
	public void setTokenTime(long tokenTime) {
		this.tokenTime = tokenTime;
	}

	/**
	 * @return the jsapiTicket
	 */
	public String getJsapiTicket() {
		return jsapiTicket;
	}

	/**
	 * @param jsapiTicket the jsapiTicket to set
	 */
	public void setJsapiTicket(String jsapiTicket) {
		this.jsapiTicket = jsapiTicket;
	}

	/**
	 * @return the ticketExpires
	 */
	public long getTicketExpires() {
		return ticketExpires;
	}

	/**
	 * @param ticketExpires the ticketExpires to set
	 */
	public void setTicketExpires(long ticketExpires) {
		this.ticketExpires = ticketExpires;
	}

	/**
	 * @return the ticketTime
	 */
	public long getTicketTime() {
		return ticketTime;
	}

	/**
	 * @param ticketTime the ticketTime to set
	 */
	public void setTicketTime(long ticketTime) {
		this.ticketTime = ticketTime;
	}

	/**
	 * @return the weixinTokenMap
	 */
	public static Map<String, AccessToken> getWeixinTokenMap() {
		return weixinTokenMap;
	}

	/**
	 * @param weixinTokenMap the weixinTokenMap to set
	 */
	public static void setWeixinTokenMap(Map<String, AccessToken> weixinTokenMap) {
		AccessToken.weixinTokenMap = weixinTokenMap;
	}
	
}
