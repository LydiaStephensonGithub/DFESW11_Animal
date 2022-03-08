package com.lms.children;

import com.lms.parent.Animal;

public class Hawk extends Animal {
	
	private int flyingAbility;
	private int peckingStrength;

	@Override
	public int speed() {
		return 7;
	}

	@Override
	public int strength() {
		return 6;
	}

	@Override
	public String speak() {
		return "Caw Caw!";
	}

	@Override
	public int score() {
		int bonus = speed() + strength() + this.flyingAbility + this.peckingStrength;
		setEnergyLevel(bonus);
		return getEnergyLevel();
	}

	public Hawk() {}

	public Hawk(String name, String species, int energyLevel, int flyingAbility, int peckingStrength) {
		super(name, species, energyLevel);
		this.flyingAbility = flyingAbility;
		this.peckingStrength = peckingStrength;
	}

	public int getFlyingAbility() {
		return flyingAbility;
	}

	public void setFlyingAbility(int flyingAbility) {
		this.flyingAbility = flyingAbility;
	}

	public int getPeckingStrength() {
		return peckingStrength;
	}

	public void setPeckingStrength(int peckingStrength) {
		this.peckingStrength = peckingStrength;
	}

}
