package com.henry.test;

import org.junit.Test;

import com.henry.utils.EncryptUtil;

public class TestEncryptUtil {
	@Test
	public void test() {
		String str = EncryptUtil.encode("Henry".getBytes());
		System.out.println(str);
		
		String str1 = EncryptUtil.decode(str.getBytes());
		System.out.println(str1);
	}
}
