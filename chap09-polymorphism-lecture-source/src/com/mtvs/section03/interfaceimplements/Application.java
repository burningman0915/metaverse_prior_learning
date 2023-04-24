package com.mtvs.section03.interfaceimplements;

public class Application {
	public static void main(String[] args) {
		
		/* 인터페이스는 타입으로는 활용될 수 있지만 인스턴스를 생성하지 못하고, 생성자 자체가 존재하지 않는다. */
//		InterProduct interProduct = new InterProduct();		// 에러 남
		
		/* 상위 타입으로는 사용이 가능하다.(다형성) */
		InterProduct interProduct = new SmartPhone();
		
		/* 인터페이스의 추상 메소드를 실행하면 오버라이딩 한 메소드로 동적 바인딩에 의해 메소드가 호출 됨 */
		interProduct.nonStaticMethod();
		interProduct.abstractMethod();
		
		/* 인터페이스의 필드는 직접 접근할 수 있고(public static final 이므로) 인터페이스명.필드명으로 접근함 */
		System.out.println(InterProduct.MAX_NUM);
		System.out.println(InterProduct.MIN_NUM);
		
		/* 오버라이딩 하지 않아도 되는 구현부가 있는 메소드 실행해 보기 */
		InterProduct.staticMethod();   // 인터페이스명.메소드명();
		interProduct.defaultMethod();
	}
}







