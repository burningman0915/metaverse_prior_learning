package com.mtvs.section01.extend;

public class Car extends Object{
	
	/* 자동차의 달리는 상태를 확인할 수 있는 필드 */
	private boolean isRunning;
	
	public Car() {
		super();
		System.out.println("Car 클래스 기본 생성자 호출됨...");
	}
	
	/* 달리는 상태 확인용 메소드 */
	public boolean getIsRunning() {
		return this.isRunning;
	}
	
	/* 클락션(경적)을 울리는 기능을 위한 메소드 */
	public void soundHorn() {
		if(this.isRunning) {				// 달릴 때 경적 울릴 시
			System.out.println("빵! 빵!");
		} else {							// 달리지 않을 때 경적 울릴 시
			System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
		}
	}
	
	public void run() {
		this.isRunning = true;
		System.out.println("자동차가 달립니다.");
	}
	
	public void stop() {
		this.isRunning = false;
		System.out.println("자동차가 멈춥니다.");
	}
}






