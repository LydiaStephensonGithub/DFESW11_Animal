package com.lms.parent;

import com.lms.interfaces.Speed;
import com.lms.interfaces.Strength;

public abstract class Animal implements Speed, Strength {
	private String name;
	private String species;
	private int energyLevel;
	
	public abstract String speak();
	public abstract int score();
	
	public String attack(Animal o) {
		if (this.energyLevel > o.energyLevel) {
			return this.name + " the " + this.species + " won the fight!";
		} else {
			return this.name + " the " + this.species + " lost the fight!";
		}
	}
	
	public Animal() {}

	public Animal(String name, String species, int energyLevel) {
		this.name = name;
		this.species = species;
		this.energyLevel = energyLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", energyLevel=" + energyLevel + "]";
	}
	
}
