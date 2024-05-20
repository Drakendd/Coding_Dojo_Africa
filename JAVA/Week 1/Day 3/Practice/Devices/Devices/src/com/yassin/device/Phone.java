package com.yassin.device;

public class Phone extends Device {
	public Phone() {
		super();
	}
	public void makeCall() {
		int battery=getBattery();
		setBattery(battery-5);
	}
	public void playGame() {
		System.out.println(getBattery());
		if(getBattery()<=25) {
		System.out.println("You low on battery you cant play");
	
	}else {
		setBattery(getBattery()-25);
		
	}
	
	}
	public void charge () {
		int battery = getBattery();
		setBattery(getBattery()+50);
	}
}
