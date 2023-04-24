package com.mtvs.section02.abstractclass;

public class Application {
	public static void main(String[] args) {
		
		/* 추상 클래스와 추상 메소드 */
		
		/* 추상 클래스의 기본 생성자는 추상클래스의 객체를 만들 수 없다. */
//		Product product = new Product();
		
		/* 추상 클래스는 다형성 적용에서 사용되는 레퍼런스 타입으로 활용할 수 있다. */
		Product product = new SmartPhone();
		
		/* 동적바인딩에 의해 SmartPhone의 오버라이딩 한 메소드가 호출되는 것을 알 수 있다.(오버라이딩 O) */
		product.abstractMethod();
		
		/* 부모인 추상클래스가 가지는 일반적인 non-static 메소드와 static 메소드 호출(오버라이딩 X) */
		product.nonStaticMethod();
		
		Product.staticMethod();
	}
}
