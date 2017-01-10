package com.dao;

public class entity{
	private String name="nin";
	private String titles[];
	public entity(){
		titles = new String[6];
		titles[0] = "首页";
		titles[1] = "首页";
		titles[2] = "首页";
		titles[3] = "首页";
		titles[4] = "首页";
		titles[5] = "首页";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getTitles() {
		return titles;
	}
	public void setTitles(String[] titles) {
		this.titles = titles;
	}
	
}