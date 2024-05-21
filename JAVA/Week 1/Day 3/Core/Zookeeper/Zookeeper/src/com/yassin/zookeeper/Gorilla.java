package com.yassin.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();	
	}
	public void throwSomething() {
		setEnergy(getEnergy()-5);
		System.out.printf("the gorilla throw something and the energy decrese : %s ",super.getEnergy());
	}
	public void eatSomething() {
		setEnergy(getEnergy()+10);
		System.out.printf("the gorilla energy increased by 10 : %s ",super.getEnergy());
	}
	public void climb(){
		setEnergy(getEnergy()-10);
		System.out.printf(" the gorilla energy decreased by 10 : %s ",super.getEnergy());
	}
}
