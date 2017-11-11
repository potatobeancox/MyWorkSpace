package com.potato.test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {
	public static void main(String[] args) {
		ThreadLocal<StringBuilder> sbx = new ThreadLocal<>();
		
//		CyclicBarrier barrier = new CyclicBarrier(parties);
		
		
		StringBuilder builder = new StringBuilder();
		
		StringBuffer buffer = new StringBuffer();
		
//		Hashtable
		
//		ArrayList<E>
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			return;
//		}
		
		Set<String> set = new TreeSet<>();
//		set.contains(new Object());
		
		
		
		
		
		Set<String> set1 = new HashSet();
		
		Map<String, String> map = new HashMap<>();
//		map.p
		Map<String, String> map1 = new TreeMap();
		
		
		map = new LinkedHashMap<>();
		
		
		char[] ch = {'a','b','c','d'};
		int[] arr = {1,2,3,4};
		PrintStream out = System.out;
		out.println(ch);
		out.println(arr);
		
//		ConcurrentHashMap<K, V>
//		Hashtable<K, V>
//		Collections.synchronizedMap(m)
//		ReentrantLock
//		ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue)

		
//		LinkedHashMap<K, V>
	}
}

interface inter {
	static void function(){
		
	}
}