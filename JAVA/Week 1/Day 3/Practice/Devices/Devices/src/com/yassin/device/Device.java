package com.yassin.device;

public class Device {
	private int battery;
	public Device() {
        this.battery = 100;
    }
    public int getBattery() {
    	return this.battery;
    }
    public void setBattery(int battery){
    	this.battery=battery;
    	}
    }