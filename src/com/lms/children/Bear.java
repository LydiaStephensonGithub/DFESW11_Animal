package com.lms.children;

import com.lms.parent.Animal;

public class Bear extends Animal {
	
	private int biteStrength;
	private int clawControl;
	
	@Override
	public int speed() {
		return 7;
	}
	
	@Override
	public int strength() {
		return 8;
	}
	
	@Override
	public String speak() {
		return "Roar!";
	}
	
	@Override
	public int score() {
		int bonus = speed() + strength() + this.biteStrength + this.clawControl;
		setEnergyLevel(bonus);
		return getEnergyLevel();
	}
	
	public Bear() {}
	
	public Bear(String name, String species, int energyLevel, int biteStrength, int clawControl) {
		super(name, species, energyLevel);
		this.biteStrength = biteStrength;
		this.clawControl = clawControl;
	}

	public int getBiteStrength() {
		return biteStrength;
	}

	public void setBiteStrength(int biteStrength) {
		this.biteStrength = biteStrength;
	}

	public int getClawControl() {
		return clawControl;
	}

	public void setClawControl(int clawControl) {
		this.clawControl = clawControl;
	}
	
}
