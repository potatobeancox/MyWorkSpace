package com.potato.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FatherClass {
	private String fatherName; 
	protected int fatherAge = 50;
	
	public String getName() {
		return fatherName;
	}
	
	public static void main(String[] args) {
//		SonClass[] sons = new SonClass[10];
//		FatherClass[] fathers = sons;
		SonClass son = new SonClass();
//		fathers[0] = son;
//		fathers[1] = new FatherClass();
//		sons[2] = new FatherClass();	抛异常
		
		System.out.println(son.getAge());
		
		System.out.println(son.getFatherAge());
		HashMap map = new HashMap<>();
//		map.equals(o);
		Objects.hashCode(null);
		
		Integer.parseInt("123");
	}
}


class SonClass extends FatherClass{
	
	public String getFatherName() {
		return super.getName();
		
	}
	
	public int getAge() {
		fatherAge = 30;
		return fatherAge;
	}
	
	public int getFatherAge() {
		return super.fatherAge;
	}
}
