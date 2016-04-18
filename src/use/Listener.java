package use;

import common.HashConstants;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月18日上午9:20:59
 */
public class Listener extends Thread{
	public void run() {
		while(true){
			int array_use = 0;
			int list_use = 0;
			for(int i = 0; i < HashConstants.hash_count; i++){
				if(StorePool.stores[i] != null && StorePool.stores[i].size() > 0){
					array_use++;
					list_use += StorePool.stores[i].size();
				}
			}
			System.out.println("array usage: " + array_use + "/" + HashConstants.hash_count);
			System.out.println("list usage:" + list_use);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
