package com.henry.utils;

import org.junit.Test;

public class EncryptUtil {
	@SuppressWarnings("restriction")
	public static String getBASE64(String str) {
		return (new sun.misc.BASE64Encoder().encode(str.getBytes()));
	}
	
	@Test
	public void test() {
		String str = getBASE64("SfsdfewWQr123--q");
		System.out.println(str);
	}
}
