package use;

import java.util.LinkedList;

import model.Message;
import common.HashConstants;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月18日上午8:48:04
 */
public class StorePool {
	@SuppressWarnings("unchecked")
	public static LinkedList<Message>[]  stores = new LinkedList[HashConstants.hash_count];
	
	public static int total_message_count = 0;
}
