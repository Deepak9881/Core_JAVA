package com.demo.test;

import com.demo.beans.Class1;

public class MyThreadrunnable implements Runnable {
     private Class1 c;
     private int x;
     
     
   
	public MyThreadrunnable(Class1 c, int x) {
		super();
		this.c = c;
		this.x = x;
	}



	@Override
	public void run() {
	  int sum=c.sum(x);
	  if(sum!=0) {
		  System.out.println("Sum of "+x+" numbers = "+sum);
	  }
	  else {
		  System.out.println("Enter a valid value");
	  }
	}

}
