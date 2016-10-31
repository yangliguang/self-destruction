package use;

import java.util.LinkedList;

import model.Message;
import common.HashConstants;
import utils.Hash;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月18日上午8:48:54
 */
public class Write extends Thread {
	public void run() {
		for(int i = 1; i <= HashConstants.message_count; i++){
//			System.out.println("posting message " + i + "/" + HashConstants.message_count);
			Message m = Message.genMessage(i);
			int hash_value = Hash.hash(m.getMessage_id());
			if(StorePool.stores[hash_value] == null){
				LinkedList<Message> messages = new LinkedList<Message>();
				messages.add(m);
				StorePool.stores[hash_value] = messages;
			} else{
				StorePool.stores[hash_value].add(m);
			}
			
			StorePool.total_message_count = i;
			try {
				Thread.sleep(20);
				//this.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("finished");
	}
}
