package test;

import org.apache.commons.lang3.RandomStringUtils;

import utils.Hash;

/**
 * Author:Young
 * Class Comment:测试Hash.hash
 * Date: 2016年4月7日下午3:24:16
 */
public class Test02 {
	public static void main(String[] args) {
		String content = RandomStringUtils.randomAlphanumeric(20);
		Hash hash = new Hash();
		int hash_value = hash.hash(content);
		System.out.println(hash_value);
	}
}
