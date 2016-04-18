package use;

import common.HashConstants;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月18日上午8:51:41
 */
public class Read extends Thread{
	public void run() {
		while(true){
			int array_index = (int)(Math.random()*HashConstants.hash_count);
			if(StorePool.stores[array_index] != null && StorePool.stores[array_index].size() > 0){
				int list_index = (int)(Math.random()*StorePool.stores[array_index].size());
				int k = StorePool.stores[array_index].get(list_index).getK();
				StorePool.stores[array_index].get(list_index).setK(k-1);
				if(StorePool.stores[array_index].get(list_index).getK() <= 0)
					StorePool.stores[array_index].remove(list_index);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
