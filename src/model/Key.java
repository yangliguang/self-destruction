package model;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月7日下午3:37:30
 */
public class Key {
	/*
	 * 秘钥ID
	 */
	private int kid;
	
	/*
	 * 秘钥ID对应的存储ID
	 */
	private int sid;
	
	public Key(int kid, int sid){
		this.kid = kid;
		this.sid = sid;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
