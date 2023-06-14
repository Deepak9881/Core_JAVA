package com.demo.thread;

import com.demo.beans.Searchfile;

	public class ThreadSearch extends Thread{
		Searchfile ob=new Searchfile();
		private String F;
		private String s1;
		
		public ThreadSearch(String f, String s1) {
			super();
			F = f;
			this.s1 = s1;
		} 
		
	

		public void run() {
			boolean status=ob.searchWord(F,s1);
			
			if(status) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}
		}
		

	}



