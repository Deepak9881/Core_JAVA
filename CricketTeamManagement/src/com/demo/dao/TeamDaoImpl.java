package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

import com.demo.beans.Player;
import com.demo.beans.Team;


public class TeamDaoImpl implements TeamDao{
	
	private static Set<Team> tset;
	
	
	static {
		tset=new HashSet<>();
		List<Player>plist=new ArrayList<>();
		plist.add(new Player(10,"Sachin","Batsman"));
		plist.add(new Player(7,"Dhoni","Batsman"));
		plist.add(new Player(11,"Shami","Baller"));
		Team t=new Team(1,"India","Ravi",plist);
		tset.add(t);
	}


	@Override
	public void save(Team t) {
		tset.add(t);		
	}


	@Override
	public List<Team> getAll() {
		return new ArrayList<>(tset);
		
	}


	@Override
	public Team getById(int tid) {
		for(Team t:tset) {
			if(t.getTeamid()==tid) {
				return t;
			}
		}
		return null;
	}


	@Override
	public boolean deleteById(int tid) {
		for(Team t:tset) {
			if(t.getTeamid()==tid) {
				tset.remove(t);
				return true;
			}
		}
		return false;
	}


	@Override
	public void addPlayer(int tid, Player p) {
		for(Team t:tset) {
			if(t.getTeamid()==tid) {
				t.getPlist().add(p);
			}
		}
	}


	@Override
	public List<Player> getAllBatsman() {
		List<Player>plist=new ArrayList<>();
		for(Team t:tset) {
			for(Player p:t.getPlist()) {
				if(p.getSkill().equals("Batsman")) {
					plist.add(p);
				}
			}
		}
		return plist;
	}


	@Override
	public Set<Team> sortByName() {
		Comparator<Team> c=(ob1,ob2)->{return ob1.getTeamnane().compareTo(ob2.getTeamnane());};
		Set<Team>tset1=new TreeSet<>(c);
		for(Team t:tset) {
			tset1.add(t);
		}
		Set<Team>tset2=new TreeSet<>();
		for(Team t:tset) {
			tset2.add(t);
		}
		return tset2;
	}


}
