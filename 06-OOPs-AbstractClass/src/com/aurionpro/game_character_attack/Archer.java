package com.aurionpro.game_character_attack;

public class Archer extends GameCharacter{

	public Archer(String name, Integer powerLevel) {
		super(name, powerLevel);
	}

	@Override
	Integer attack() {
		return powerLevel -= 5;
	}
	
    void printPowerLevel(){
    	System.out.println("\nArcher  ' " + name + " ' is attacking .....");
    	System.out.println("Attacked finished -> Remaining power level : " + powerLevel) ;
    }
    
	boolean isPowerRemaining() {
		if(powerLevel <= 0) {
			System.out.println("Archer is out of Power , Choose different Attacker...");
			return false;
		}
		return true;
	}
}
