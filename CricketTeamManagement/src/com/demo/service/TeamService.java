package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Player;
import com.demo.beans.Team;

public interface TeamService {

	void addTeam();

	List<Team> displayAll();

	Team displayById(int tid);

	boolean deleteById(int tid);

	void addPlayer(int tid);

	List<Player> getAllBatsman();

	Set<Team> sortByName();

}
