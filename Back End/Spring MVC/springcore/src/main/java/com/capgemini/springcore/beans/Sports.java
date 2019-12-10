package com.capgemini.springcore.beans;

import java.util.Map;

public class Sports {

	private String name;
	private int totalplayers;
	private Map<String ,String> teamInfo;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalplayers() {
		return totalplayers;
	}
	public void setTotalplayers(int totalplayers) {
		this.totalplayers = totalplayers;
	}
	public Map<String, String> getTeamInfo() {
		return teamInfo;
	}
	public void setTeamInfo(Map<String, String> teamInfo) {
		this.teamInfo = teamInfo;
	}
	
	
}//End of class
