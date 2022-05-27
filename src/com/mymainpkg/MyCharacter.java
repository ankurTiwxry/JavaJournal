package com.mymainpkg;

public abstract class MyCharacter {
	
	protected String m_name;
	protected int m_age;
	
	public MyCharacter(String name, int age) {
		this.m_name = name;
		this.m_age = age;
	}
	
	
	// Getters ----------------------------------------------
	public void setName(String name) {
		this.m_name = name;
	}
	
	public void setAge(int age) {
		this.m_age = age;
	}
	
	

}
