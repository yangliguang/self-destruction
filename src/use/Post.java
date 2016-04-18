package use;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import model.Message;
import model.Store;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import common.HashConstants;
import utils.Hash;

/**
 * Author:Young
 * Class Comment:插入消息
 * Date: 
 */
public class Post {
	public static void main(String[] args) {
		
		Store[]  stores = new Store[HashConstants.hash_count];
		//System.out.println(sizeof(stores));
		for(int i = 1; i <= HashConstants.message_count; i++){
			//System.out.println("posting message " + i + "/" + HashConstants.message_count);
			Message m = Message.genMessage(i);
			insert(stores, m);
					
			//post(messages, i);
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
	
	public static void insert(Store[] stores, Message m){
		int hash_value = Hash.hash(m.getMessage_id());
		if(stores[hash_value] == null){
			LinkedList<Message> messages = new LinkedList<Message>();
			messages.add(m);
			stores[hash_value] = new Store(hash_value, messages);
		} else{
			stores[hash_value].getContent().add(m);
		}
			
	}
	
}
