package com.aurionpro.game_character_attack;

public class Warrior extends GameCharacter{


	public Warrior(String name, Integer powerLevel) {
		super(name, powerLevel);
	}

	@Override
	Integer attack() {
		return powerLevel -= 10;
	}
	
    void printPowerLevel(){
    	System.out.println("\nWarrior " + name + " is attacking .....");
    	System.out.println("Attacked finished -> Remaining power level : " + powerLevel) ;
    }
    
	boolean isPowerRemaining() {
		if(powerLevel <= 0) {
			System.out.println("Warrior is out of Power , Choose different Attacker...");
			return false;
		}
		return true;
	}
	
}
