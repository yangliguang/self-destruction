package model;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月7日下午3:29:22
 */
public class MS {
	/*
	 * 消息ID
	 */
	private int mid;
	
	/*
	 * 存储ID,即消息哈希值
	 */
	private int sid;
	
	public MS(int mid, int sid){
		this.mid = mid;
		this.sid = sid;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
}
