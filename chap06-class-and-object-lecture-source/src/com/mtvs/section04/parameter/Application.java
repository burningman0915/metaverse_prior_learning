package com.mtvs.section04.parameter;

public class Application {
	public static void main(String... args) {
		
		/* main 메소드의 매개변수 테스트 */
		ParameterTest pt = new ParameterTest();
		
		/* 1. 기본자료형 */
		int num = 20;
		pt.testPrimitiveTypeParameter(num);
		
		/* 2. 기본자료형 배열 */
		int[] iArr = new int[] {1, 2, 3, 4, 5};
		pt.testPrimitiveTypeArrayParameter(iArr);
		
		System.out.println();
		
		/* 3. 클래스 자료형(클래스 이름의 참조 자료형) */
		Rectangle r1 = new Rectangle(12.5, 22.5);
//		System.out.println(r1.toString());
		System.out.println(r1);		// println은 해당 객체의 toString() 메소드를 자동 실행함
		
		pt.testClassTypeParameter(r1);
		
		/* 4. 클래스자료형 배열(객체 배열) - 뒷부분에서 다루고 생략 */
		Rectangle[] rArr = new Rectangle[4];
		
		/* 5. 가변인자 - 원리는 이해하되 사용은 자제(지양)하자. */
//		pt.testVariableLengthArrayParameter();
		pt.testVariableLengthArrayParameter("홍길동");
		pt.testVariableLengthArrayParameter("유관순", "볼링");
		pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");
		pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스", "서예", "수필"}); 
	}
}








