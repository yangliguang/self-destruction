package utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import model.Message;
import common.HashConstants;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月18日上午8:53:40
 */
public class Test {
	public static void main(String[] args) {
//		System.out.println((int)(Math.random()*HashConstants.hash_count));
//		LinkedList<String> a = new LinkedList<String>();
//		Message m = new Message();
//		Message[] ms = new Message[10];
//		LinkedList<String>[] as = new LinkedList[10];
//		LinkedList<Integer> l = new LinkedList<Integer>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		System.out.println(l.remove(1));
//		System.out.println(l);
		int a = 0;
		System.out.println(--a < 0);
		LinkedList<Message> l = new LinkedList();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp from = Timestamp.valueOf(sdf.format(new Date()));
		Message m = new  Message(111,"test",3,from,from,from,11);
		l.add(m);
		System.out.println(l.get(0).getK());
		l.get(0).setK(33);
		System.out.println(l.get(0).getK());
		
	}
}
