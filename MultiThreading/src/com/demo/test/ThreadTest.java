package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyClass;
import com.demo.thread.MyThread;
import com.demo.thread.ThreadSearch;

public class ThreadTest {

	public static void main(String[] args) {
		//MyClass ob= new MyClass();
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("In main()");
//		MyThread th1= new MyThread(ob,5);
//		MyThread th2=new MyThread(ob,7);
//		MyThread th3=new MyThread(ob,10);
//		th3.start();
//		th1.start();
//		th2.start();
		
//		try {
//			th3.join();
//			th1.join();
//			th2.join();
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Enter the string to be searched");
		String str=sc.next();
        Thread  ts=new ThreadSearch("Sandy.txt",str);
        ts.start();
        try {
			ts.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//System.out.println("Main ends");

	}

}
