package com.henry.utils;

import org.apache.commons.codec.binary.Base64;

public class EncryptUtil {
	
	//º”√‹
	public static String encode(final byte[] bytes) {  
		return new String(Base64.encodeBase64(bytes));  
	}
	
	//Ω‚√‹
	public static String decode(final byte[] bytes) {
		return new String(Base64.decodeBase64(bytes));  
	}
	
}
