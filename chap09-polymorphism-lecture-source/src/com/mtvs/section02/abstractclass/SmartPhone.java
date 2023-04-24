package com.mtvs.section02.abstractclass;

public class SmartPhone extends Product{

	public SmartPhone() {
		super();
	}

	@Override
	public void abstractMethod() {
		System.out.println("Product 클래스의 abstractMethod를 오버라이딩 한 메소드 호출함...");
	}

	@Override
	public void abstractMethod2() {
		
	}

	@Override
	public void abstractMethod3() {
		
	}
}
