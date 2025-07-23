package com.aurionpro.game_character_attack;

public abstract class GameCharacter {
	protected String name;
	protected Integer powerLevel;

	public GameCharacter(String name, Integer powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
	}

	abstract Integer attack();

}
