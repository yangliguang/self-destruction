package test;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:数列求和
 * Date: 2016年4月7日下午9:11:02
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double m = sc.nextInt() * 1.0;
			int n = sc.nextInt();
			double sum = 0;
			for(int j = 0; j < n; j++){
				sum += m;
				m = Math.sqrt(m);
			}
			System.out.printf("%.2f", sum);
			System.out.println();
		}
		sc.close();
	}
}
