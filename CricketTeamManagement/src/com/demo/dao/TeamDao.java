package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Player;
import com.demo.beans.Team;

public interface TeamDao {

	void save(Team t);

	List<Team> getAll();

	Team getById(int tid);

	boolean deleteById(int tid);

	void addPlayer(int tid, Player p);

	List<Player> getAllBatsman();

   Set<Team> sortByName();

}
