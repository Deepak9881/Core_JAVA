package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;

public class Searchfile {
	public Searchfile() {
		System.out.println("In search constructor");
	}
	

	
	public boolean searchWord(String file, String str) {
		System.out.println("In search method");
		try(BufferedReader bf=new BufferedReader(new FileReader(file));){
			String s=null;
			do { 
				s=bf.readLine();
				try {
				Thread.sleep(100);
				
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
				
				if(str.equals(s)) {
				 return true;
			}
			}
				while(s!=null);
			
		}catch(IOException e){
			System.out.println(e);
		}
		
		
		return false;
		
	}

}
