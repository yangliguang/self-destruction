package model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import utils.Hash;
import common.HashConstants;


/**
 * @author Young
 *
 */
public class Message {
	/*
	 * 消息内容主体
	 */
	private String message;
	/*
	 * 可解密次数
	 */
	private int k;
	
	/*
	 * 消息发送时间
	 */
	private Timestamp post_time;

	/*
	 * 可解密起始时间
	 */
	private Timestamp from;
	/*
	 * 可解密结束时间
	 */
	private Timestamp to;
	
	/*
	 * message的哈希值
	 */
	private int hash_value;
	
	/*
	 * meesage_id 对应表bitset_message
	 */
	private int message_id;
	/*
	 * 累计擦除次数
	 */
	private int erae_count;
	
	public Message(){}
	public Message(int message_id, String message, int k, Timestamp post_time, Timestamp from, Timestamp to, int hash_value){
		this.message_id = message_id;
		this.message = message;
		this.k = k;
		this.post_time = post_time;
		this.from = from;
		this.to = to;
		this.hash_value = hash_value;
	}
	
	public static Message genMessage(int message_id){
		String content = RandomStringUtils.randomAlphanumeric(20);
		Hash hash = new Hash();
		int hash_value = hash.hash(content);
		int k = RandomUtils.nextInt(HashConstants.min_k, HashConstants.max_k);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp from = Timestamp.valueOf(sdf.format(new Date()));//转换时间字符串为Timestamp
		//t分钟后
		int t = RandomUtils.nextInt(HashConstants.min_t, HashConstants.max_t);
		Timestamp to = Timestamp.valueOf(sdf.format(new Date(new Date().getTime() + t * 60 * 1000)));
		Message message = new  Message(message_id,content,k,from,from,to,hash_value);
		return message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public Timestamp getFrom() {
		return from;
	}
	public void setFrom(Timestamp from) {
		this.from = from;
	}
	public Timestamp getTo() {
		return to;
	}
	public void setTo(Timestamp to) {
		this.to = to;
	}
	public int getHash_value() {
		return hash_value;
	}
	public void setHash_value(int hash_value) {
		this.hash_value = hash_value;
	}
	public Timestamp getPost_time() {
		return post_time;
	}
	public void setPost_time(Timestamp post_time) {
		this.post_time = post_time;
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public int getErae_count() {
		return erae_count;
	}
	public void setErae_count(int erae_count) {
		this.erae_count = erae_count;
	}
}
