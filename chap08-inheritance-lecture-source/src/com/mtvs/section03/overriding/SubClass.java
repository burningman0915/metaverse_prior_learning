package com.mtvs.section03.overriding;

public class SubClass extends SuperClass{
	
	/* 오버라이딩 시에는 @Override 어노테이션을 먼저 쓰면서 작성하자. */
//	@Override
//	public Object method(int num1) {return null;}		 // 오버라이딩 시 변수명은 상관 없다.
	
	/* 부모가 가진 메소드명과 일치하지 않으면 에러 발생 */
//	@Override
//	public Object method1(int num) {return null;}
	
	/* 반환형은 같아야 되지만 부모의 메소드 반환형의 자식 타입으로 반환하는 것은 허용한다.(JDK 7부터 허용) */
	@Override
	public String method(int num) {return "abc";}
	
	/* 부모가 가진 매개변수의 갯수나 타입, 순서를 변경하면 에러 발생(매개변수는 똑 같이 적어줘야 함) */
//	@Override
//	public Object method(int num, String str) {}
	
	/* private 메소드는 오버라이딩 불가 */
//	@Override
//	private void privateMethod() {}
	
	/* final 메소드는 오버라이딩 불가 */
//	@Override
//	public final void finalMethod() {}
	
	/* 부모 메소드의 접근 제한자와 범위가 같거나 더 넓은 범위로 오버라이딩 가능 */
//	@Override
//	protected void protectedMethod() {}		// 같은 범위로는 가능
	
//	@Override
//	public void protectedMethod() {}		// 더 넓은 범위로는 가능
	
//	@Override
//	void protectedMethod() {}				// 더 좁은 범위로는 불가능
	
	/*
	 * 부모 클래스에 final 키워드를 추가하면 상속 자체가 되지 않는다.
	 * 마지막 클래스로 더 이상의 자식 클래스를 두지 않기 때문이다.
	 */
}





