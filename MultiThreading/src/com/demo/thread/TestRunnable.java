package com.demo.thread;

import com.demo.beans.Class1;
import com.demo.test.MyThreadrunnable;

public class TestRunnable {
	public static void main(String[] args) {
		Class1 c=new Class1();
		
		
		MyThreadrunnable m1= new MyThreadrunnable(c,10);
		MyThreadrunnable m2= new MyThreadrunnable(c,40);
		MyThreadrunnable m3= new MyThreadrunnable(c,50);
		
		Thread th1=new Thread(m1);
		Thread th2=new Thread(m2);
		Thread th3=new Thread(m3);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
