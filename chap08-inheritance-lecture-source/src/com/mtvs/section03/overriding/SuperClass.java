package com.mtvs.section03.overriding;

public class SuperClass {					// class의 접근 제어자는 public과 default 뿐이다.
//public final class SuperClass {			// class 또한 final 키워드를 사용할 수 있으며 final 키워드 사용 시 자식 클래스를 가지지 못한다.

	public Object method(int num) {return null;}
	
	private void privateMethod() {}
	
	public final void finalMethod() {}
	
	protected void protectedMethod() {}
}
