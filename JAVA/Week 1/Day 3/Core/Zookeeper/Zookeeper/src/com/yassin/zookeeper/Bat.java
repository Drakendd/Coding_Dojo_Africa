package com.yassin.zookeeper;

public class Bat extends Mammal {
	private int energy;
	public Bat() {
		this.energy=300;
	}
	public void fly() {
		setEnergy(getEnergy()-50);
		System.out.printf("the bat is airborne fast one too : %s ",super.getEnergy());
	}
	public void eatHumans() {
		setEnergy(getEnergy()+25);
		System.out.printf("the bat satisfaction is eating humans : %s ",super.getEnergy());
	}
	public void attackTown(){
		setEnergy(getEnergy()-100);
		System.out.printf(" the bat destroyed the town : %s ",super.getEnergy());
	}
	

}
