package test;

import java.util.HashMap;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月7日上午9:06:35
 */
public class Test01 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println(hm.size());
		hm.put(1, "1");
		hm.put(1, "2");
		System.out.println(hm.get(1));
		hm.remove(1);
		System.out.println(hm.size());
	}
}
