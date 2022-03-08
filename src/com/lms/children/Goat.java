package com.lms.children;

import com.lms.parent.Animal;

public class Goat extends Animal {
	
	private int agility;
	private int munching;
	
	@Override
	public int speed() {
		return 5;
	}
	
	@Override
	public int strength() {
		return 4;
	}
	
	@Override
	public String speak() {
		return "Baaaa!";
	}
	
	@Override
	public int score() {
		int bonus = speed() + strength() + this.agility + this.munching;
		setEnergyLevel(bonus);
		return getEnergyLevel();
	}
	
	public Goat() {}
	
	public Goat(String name, String species, int energyLevel, int agility, int munching) {
		super(name, species, energyLevel);
		this.agility = agility;
		this.munching = munching;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getMunching() {
		return munching;
	}

	public void setMunching(int munching) {
		this.munching = munching;
	}
	
}
