package com.mymainpkg;

class Peasant extends MyCharacter {
	
	private int m_wage;
	
	public Peasant(String name, int age, int wage) {
		super(name, age);
		this.m_name = name;
		this.m_age = age;
		this.m_wage = wage;
	}
	
	public void setPower(int wage) {
		this.m_wage = wage;
	}
	
	public int getWage() {
		return m_wage;
	}

}
