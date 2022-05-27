package com.mymainpkg;

public class Warrior extends MyCharacter implements CharacterLifeEvents {
	
	// initialize values
	// movement class
	CharacterMovement movement = new WarriorMovement();
	// variables
	private int m_power;
	private int m_ageOffset = 5;
	
	public Warrior(String name, int age, int power) {
		super(name, age);
		this.m_name = name;
		this.m_age = age;
		this.m_power = power;
	}
	
	public void setPower(int power) {
		this.m_power = power;
	}
	
	public int getPower() {
		return m_power;
		// return this.m_power;
	}
	
	public String getWarriorLocation() {
		return movement.getPlayerLocation();
	}
	
	// character life events
	
	public void birthday() {
		this.m_age = this.m_age + this.m_ageOffset;
	}
	

}
