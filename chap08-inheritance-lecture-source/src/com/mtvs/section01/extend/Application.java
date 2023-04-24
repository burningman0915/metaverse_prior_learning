package com.mtvs.section01.extend;

public class Application {
	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println("달리는 상태인지: " + car.getIsRunning());
		
		car.soundHorn();
		car.run();
		car.soundHorn();
		car.stop();
		car.soundHorn();
		System.out.println();
		
		FireCar fireCar = new FireCar();
		fireCar.soundHorn();
		fireCar.run();
		fireCar.soundHorn();
		fireCar.stop();
		fireCar.soundHorn();
		fireCar.sprayWater();		
		System.out.println();
		
		RacingCar racingCar = new RacingCar();
		racingCar.soundHorn();
		racingCar.run();
		racingCar.soundHorn();
		racingCar.stop();
		racingCar.soundHorn();
	}
}
