package com.dao.entity;

public class Entity {
	private String name="您";
	private String titles[];
	public Entity(){
		titles=new String[6];
		titles[0]="首页";
		titles[1]="博客介绍";
		titles[2]="旅游";
		titles[3]="摄影";
		titles[4]="户外运动";
		titles[5]="我的最爱";
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
