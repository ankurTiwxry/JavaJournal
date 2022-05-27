package com.mymainpkg;

import java.util.ArrayList;

public class MyMainClass {
	
	public static void main(String[] args) {
		// initialize classes
		MyLogger l = new MyLogger();
		Warrior laxmiBai = new Warrior("Rani Laxmi Bai", 175, 50);
		
//		TODO :: Initialize an array of peasants with different parameters
		Peasant peasants[] = new Peasant[3];
		for (int i = 1; i < peasants.length; i++) {
			peasants[i] = new Peasant("name",0,0);
		}
		
		ArrayList<Peasant> varName = new ArrayList<Peasant>(5);
		l.logInline("size : ");
		System.out.println(varName.size());
		for (int i = 0; i < peasants.length; i++) {
			varName.add(new Peasant("name_2",0,0));
		}
		l.logInline("size : ");
		System.out.println(varName.size());
		
		System.out.println(laxmiBai.getPower());
		l.log(laxmiBai.getWarriorLocation());
	}
	
	public void Display()
	{
		System.out.println("HOLA");
	}
	
	

}
