package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:找出水仙花数
 * Date: 2016年4月7日下午9:28:26
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			List<Integer> l = new ArrayList<Integer>();
			int m = sc.nextInt();
			int n = sc.nextInt();
			for(int i = m; i <= n; i++){
				int b = i/100;
				int s = (i/10)%10;
				int g = i%10;
				if(i == (b*b*b + s*s*s + g*g*g))
					l.add(i);
			}
			if(l.size() == 0)
				System.out.println("no");
			else{
				if(l.size() == 1)
					System.out.println(l.get(0));
				else{
					for(int i =0; i < l.size()-1; i++){
						System.out.print(l.get(i) + " ");
					}
					System.out.println(l.get(l.size()-1));
				}
				
			}
		}
	}
}
