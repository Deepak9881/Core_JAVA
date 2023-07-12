package com.demo.beans;

import java.util.List;
import java.util.Objects;

public class Team implements Comparable{
	
	private int teamid;
	private String teamnane;
	private String coach;
	private List<Player>plist;
	
	
	public Team() {
		super();
	}


	public Team(int teamid, String teamnane, String coach, List<Player> plist) {
		super();
		this.teamid = teamid;
		this.teamnane = teamnane;
		this.coach = coach;
		this.plist = plist;
	}


	public int getTeamid() {
		return teamid;
	}


	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}


	public String getTeamnane() {
		return teamnane;
	}


	public void setTeamnane(String teamnane) {
		this.teamnane = teamnane;
	}


	public String getCoach() {
		return coach;
	}


	public void setCoach(String coach) {
		this.coach = coach;
	}


	public List<Player> getPlist() {
		return plist;
	}


	public void setPlist(List<Player> plist) {
		this.plist = plist;
	}


	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamnane=" + teamnane + ", coach=" + coach + ", plist=" + plist + "]";
	}


	@Override
	public int hashCode() {
		System.out.println("in team hashcode "+this.teamid);
		return teamid;
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("in team euals "+this.teamid);
		return teamid==((Team)obj).teamid;
	}


	@Override
	public int compareTo(Object o) {
		System.out.println("in compareTo method"+this.teamid+","+((Team)o).teamid);
		if(this.getTeamid()<((Team)o).getTeamid()) {
			return -1;
		}
		else if(this.getTeamid()==((Team)o).getTeamid()) {
			return 0;
		}
		else
			return 1;
	}
	
	

}
