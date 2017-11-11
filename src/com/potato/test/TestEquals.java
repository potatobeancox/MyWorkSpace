package com.potato.test;

import java.util.Collection;
import java.util.Collections;

public class TestEquals {
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = new String("123");
		String str3 = "1" + "23";
		String str4 = new String("123");
		String str5 = "1234".substring(0, 3);
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str3);//true
		System.out.println(str2 == str4);//false
		System.out.println(str5 == str1);//false
		
		
		
	}
}
