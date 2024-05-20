package com.yassin.device;

public class DeviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone12 = new Phone();
		System.out.println("the phone charge is :"+iphone12.getBattery());
		iphone12.makeCall();
		iphone12.makeCall();
		iphone12.makeCall();
		System.out.println("the phone charge is "+iphone12.getBattery());
		iphone12.playGame();
		iphone12.playGame();
		System.out.println("the phone charge is "+iphone12.getBattery());
		iphone12.charge();
		System.out.println("the phone charge is "+iphone12.getBattery());
		
	}
	

}
