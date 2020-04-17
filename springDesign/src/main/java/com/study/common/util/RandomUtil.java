package com.study.common.util;

import java.util.Random;

public class RandomUtil {

	public static final String SOURCES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
	public static final String SOURCES_INTEGER = "0123456789";

	public static String getRandomStr(Integer length) {
		
		Random random = new Random();
		
		char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = SOURCES.charAt(random.nextInt(SOURCES.length()));
        }
        return new String(text);
	}

	public static String getRandomInteger(Integer length) {
		
		Random random = new Random();
		
		char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = SOURCES_INTEGER.charAt(random.nextInt(SOURCES_INTEGER.length()));
        }
        return new String(text);
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomInteger(6));
	}
	
}
