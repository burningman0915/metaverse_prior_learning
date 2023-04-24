package com.mtvs.section01.object_array;

public class Car {
	private String modelName;		// 모델명
	private int maxSpeed;			// 최대 속도(km/h)
	
	public Car() {
	}
	public Car(String modelName, int maxSpeed) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	public void driveMaxSpeed() {
		System.out.println(this.modelName + "이(가) 최고 시속 "
				           + this.maxSpeed + "km/h로 달려갑니다.");
	}
}
