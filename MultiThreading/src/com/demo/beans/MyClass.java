package com.demo.beans;

public class MyClass {
	public void printTable(int n) {
		for(int i=1; i<=10;i++) {
			System.out.println(n+" * "+i+" = "+ n*i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact=fact*i;
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		return fact;
	}

}
