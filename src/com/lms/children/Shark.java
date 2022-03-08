package com.lms.children;

import com.lms.parent.Animal;

public class Shark extends Animal {
	
	private int swimAbility;
	private int biteStrength;
	
	@Override
	public int speed() {
		return 9;
	}

	@Override
	public int strength() {
		return 7;
	}

	@Override
	public String speak() {
		return "Gnash Gnash!";
	}
	
	@Override
	public int score() {
		int bonus = speed() + strength() + this.swimAbility + this.biteStrength;
		setEnergyLevel(bonus);
		return getEnergyLevel();
	}
	
	public Shark() {}

	public Shark(String name, String species, int energyLevel, int swimAbility, int biteStrength) {
		super(name, species, energyLevel);
		this.swimAbility = swimAbility;
		this.biteStrength = biteStrength;
	}

	public int getSwimAbility() {
		return swimAbility;
	}

	public void setSwimAbility(int swimAbility) {
		this.swimAbility = swimAbility;
	}

	public int getBiteStrength() {
		return biteStrength;
	}

	public void setBiteStrength(int biteStrength) {
		this.biteStrength = biteStrength;
	}

}
