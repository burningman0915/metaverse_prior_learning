package com.mtvs.section04.overloading;

public class Application {
	public static void main(String[] args) {

		/*
		 * 매개변수 부분의 타입, 갯수, 순서를 다르게 작성하면 서로 다른 메소드나 생성자로 인식하기
		 * 때문에 동일한 이름의 생성자나 메소드를 여러 개 작성할 수 있게 된다.
		 * 이러한 기술을 오버로딩(Overloading)이라고 한다.
		 * 
		 * 오버로딩의 사용 이유
		 * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
		 * 이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기가 매우
		 * 어려울 것이다. 규모가 작은 프로그램의 경우 정도가 덜 하지만, 규모가 거대 해지면 메소드 또한
		 * 관리하기가 매우 어려워 진다.
		 * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로
		 * 관리하기 위해 사용하는 기술인 오버로딩을 사용한다.
		 * 
		 * 오버로딩의 조건
		 * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서(매개변수명은 상관 없다)를 다르게 작성하여
		 * 한 클래스 내에 동일한 이름의 메소드를 여러개 작성하게 된다.
		 * 메소드의 시그니처(signature)가 다르면 다른 메소드로 인식하기 때문이다.
		 * 즉, 시그니처 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성 되어야
		 * 오버로딩이 성립한다.
		 * 
		 * 메소드의 시그니처(signature)?
		 * public void method(int num) {}이라는 메소드의 메소드명과 매개변수(parameter) 선언부
		 * 부분을 메소드의 시그니처라고 부른다.
		 */
	}
	
	/* 오버로딩을 이용한 메소드 작성 테스트를 위해 기준이 되는 메소드 생성 */
	public void test() {}
	
	/* 매개변수 유무에 따른 오버로딩 성립 확인 */
	public void test(int num) {}
	
	/* 메소드의 시그니처가 동일한 경우(에러 발생) */
//	private String test() {return null;}
	
	/* 매개변수 갯수에 따른 오버로딩 성립 확인 */
	public void test(int num1, int num2) {}
	
	/* 매개변수명은 메소드 구분 기준이 아니다.(에러 발생) */
//	public void test(int num2, int num1) {}
	
	/* 매개변수 타입 변화에 따른 오버로딩 확인 */
	public void test(int num1, String num2) {}
	
	/* 매개변수 순서에 따른 오버로딩 성립 확인 */
	public void test(String num1, int num2) {}
}






