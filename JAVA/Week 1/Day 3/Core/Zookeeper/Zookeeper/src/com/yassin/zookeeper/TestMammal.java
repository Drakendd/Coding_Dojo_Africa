package com.yassin.zookeeper;

public class TestMammal {

	public static void main(String[] args) {
		Gorilla animal = new Gorilla();
		Bat specimen = new Bat();
		
		System.out.println("-------Gorilla--------");
		animal.throwSomething();
		animal.throwSomething();
		animal.throwSomething();
		
		animal.eatSomething();
		animal.eatSomething();
		
		animal.climb();
		
		animal.displayEnergy();
		
		System.out.println("-------Bat--------");
		
		specimen.attackTown();
		specimen.attackTown();
		specimen.attackTown();
		
		specimen.eatHumans();
		specimen.eatHumans();
		
		specimen.fly();
		specimen.fly();
		
		specimen.displayEnergy();

	}

}
