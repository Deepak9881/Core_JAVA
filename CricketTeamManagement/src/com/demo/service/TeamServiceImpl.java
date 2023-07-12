package com.demo.service;

import com.demo.dao.TeamDao;
import com.demo.dao.TeamDaoImpl;

import java.util.*;
import com.demo.beans.*;

public class TeamServiceImpl implements TeamService{
	private TeamDao tdao;
	Scanner sc=new Scanner(System.in);

	
      public TeamServiceImpl() {
    	  tdao=new TeamDaoImpl();
    	  }



	@Override
	public void addTeam() {
		
		System.out.println("Enter the team id");
		int tid=sc.nextInt();
		System.out.println("Enter the team name");
		String tname=sc.next();
		System.out.println("Enter the coach name");
		String cname=sc.next();
		System.out.println("Enter the no of player");
		int count=sc.nextInt();
		List<Player>plist=new ArrayList<>();
		for(int i=0; i<count;i++) {
			System.out.println("Enter the player id");
			int pid=sc.nextInt();
			System.out.println("Enter the player name");
			String pname=sc.next();
			System.out.println("Enter the skill");
			String skill=sc.next();
			Player p=new Player(pid,pname,skill);
			plist.add(p);
		}
       Team t=new Team(tid,tname,cname,plist);
       tdao.save(t);
	}



	@Override
	public List<Team> displayAll() {
		return tdao.getAll();
	}



	@Override
	public Team displayById(int tid) {
		
		return tdao.getById(tid);
	}



	@Override
	public boolean deleteById(int tid) {
		return tdao.deleteById(tid);
	}



	@Override
	public void addPlayer(int tid) {
		System.out.println("Enter the player id");
	    int pid=sc.nextInt();
	    System.out.println("Enter player name");
	    String pname=sc.next();
	    System.out.println("Enter the skill");
	    String skill=sc.next();
	    Player p=new Player(pid,pname,skill);
	    tdao.addPlayer(tid,p);
	}



	@Override
	public List<Player> getAllBatsman() {
		return tdao.getAllBatsman();
	}



	@Override
	public Set<Team> sortByName() {
		
		return tdao.sortByName();
	}
      }
