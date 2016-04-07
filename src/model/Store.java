package model;

import java.util.LinkedList;
import java.util.List;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月7日下午3:31:38
 */
public class Store {
	/*
	 * 存储ID
	 */
	private int sid;
	
	
	/*
	 * 存储内容
	 */
	private LinkedList<Message> content;
	
	public Store(int sid, LinkedList<Message> content){
		this.sid = sid;
		this.content = content;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public LinkedList<Message> getContent() {
		return content;
	}
	public void setContent(LinkedList<Message> content) {
		this.content = content;
	}
	
	/*
	 * 秘密共享密钥
	 */
	//private List<Integer> keys;

	/*
	 * 秘密共享阈值
	 */
	//private int threshold;
	
}
