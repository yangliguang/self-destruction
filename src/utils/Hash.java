package utils;

import common.HashConstants;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年10月22日下午3:54:43
 */
public class Hash {
	public int hash(String value){
		int n = 0;
		if(value.length() < 10){
			for(char c : value.toCharArray()){
				n += (int)c;
			}
		}
		else{
			char[] first10 = value.substring(0, 10).toCharArray();
			
			for(char c : first10){
				n += (int)c;
			}
		}
		return n%HashConstants.hash_count + 1;
	}
}
