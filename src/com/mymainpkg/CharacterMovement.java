package com.mymainpkg;

public abstract class CharacterMovement{

	int m_x;
	int m_y;
	
//	public CharacterMovement(String name, int age) {
//		super(name, age);
//	}
//	
	void locationData(int x, int y, int z) {
		System.out.println("Location: [ " + x + " , " + y + " , " + z +" ];");
	}
	
	// Set the x y z values depending on player
	abstract String getPlayerLocation();
}
