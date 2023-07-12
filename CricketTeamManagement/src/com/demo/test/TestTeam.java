package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.TeamService;
import com.demo.service.TeamServiceImpl;
import com.demo.beans.*;

public class TestTeam {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TeamService ts=new TeamServiceImpl();
		
		int choice=0;
		do {
		System.out.println("1. Add new Team\n2. Display all\n 3. Disaly by id\n 4. Delete Teamby id");
		System.out.println("5. add nwe player in team\n 6. display all batsman\n 7. Sort by name\n  9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			ts.addTeam();
			break;
		case 2:
			List<Team>tlist=ts.displayAll();
			tlist.forEach(System.out::println);
			break;
		case 3:
			System.out.println("Enter the id to be Searched");
			int tid=sc.nextInt();
			Team t=ts.displayById(tid);
			System.out.println(t);
			break;
		case 4:System.out.println("Enter the id to be deleted");
		    tid=sc.nextInt();
		    boolean status=ts.deleteById(tid);
		    if(status)
		    	System.out.println("Deleted Successfully");
		    else
		    	System.out.println("Not found");
		   break;
		case 5:System.out.println("Enter the team id ");
		    tid=sc.nextInt();
			ts.addPlayer(tid);
			break;
		case 6:
			List<Player> plist=ts.getAllBatsman();
			plist.forEach(System.out::println);
			break;
		case 7:
			Set<Team>tset=ts.sortByName();
			tset.forEach(System.out::println);
			break;
		case 8:
			sc.close();
			break;
			
		}
		
		}while(choice!=8);
	}

}
