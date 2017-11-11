package com.potato.test;

/**
 * 多线程实现打印1,2,3,4,交替打印
 * @author Administrator
 *
 */
public class ThreadPrint {
	
	public static void main(String[] args) {
		Printer printer1 = new Printer();
		Printer printer2 = new Printer();
		
		Thread thread1 = new Thread(printer1);
		Thread thread2 = new Thread(printer2);
		thread1.start();
		thread2.start();
		
		
	}
	
	
}


class Printer implements Runnable{
	
	private static int counter;
	
	private static Object lock = new Object();

	@Override
	public void run() {
		int i = 0;
		while( true ) {
			synchronized (lock) {
				String threadName = Thread.currentThread().getName();
				System.out.println("name:" + threadName + ",counter:" + (++counter));
				lock.notifyAll();
				try {
					lock.wait(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;
			}
		}
	}	
}