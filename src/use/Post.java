package use;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import model.Message;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import common.HashConstants;
import utils.Hash;

/**
 * Author:Young
 * Class Comment:插入消息
 * Date: 2015年10月28日下午2:00:59
 */
public class Post {
	public static void main(String[] args) {
		HashMap<Integer,Message> hm = new HashMap<Integer, Message>();
		
		for(int i = 1; i <= HashConstants.message_count; i++){
			System.out.println("posting message " + i + "/" + HashConstants.message_count);
			post(hm, i);
			try {
				//PostService ps = new PostService();
				//long timeInterval = 60*1000/ps.getPossionVariable(HashConstants.post_poisson_lamda);
				//System.err.println("Post thread is sleeping, the time interval is " + timeInterval/1000 + "s");
				//Thread.sleep(60*1000/ps.getPossionVariable(timeInterval));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("finished!!!");
	}
	
	
	public static void post(HashMap<Integer, Message> hm, int message_id){
		System.out.println("Post thread is running……");
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
		
		if(hm.get(hash_value) == null){
			hm.put(hash_value, message);
		}
			
		else{
			//hm.
		}
	}
}
