package com.demo.beans;

public class Class1 {
	
	
	public int sum(int x) {
		int sum=0;
		for(int i=1; i<=x;i++) {
			sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sum;
	}  

}
