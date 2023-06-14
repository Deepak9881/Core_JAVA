package com.demo.thread;

import com.demo.beans.MyClass;

public class MyThread extends Thread{
	private MyClass m;
	private int n;
	
	public MyThread(MyClass m, int n) {
		super();
		this.m = m;
		this.n = n;
	}
	
	public void run() {
		int j=m.factorial(n);
		System.out.println("Factorial of "+n+" : "+j);
		m.printTable(n);
		
		
	}
	
	

}
