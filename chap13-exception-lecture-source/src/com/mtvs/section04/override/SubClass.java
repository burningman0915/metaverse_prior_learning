package com.mtvs.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

	/* 예외를 던지는 메소드를 오버라이딩 해 보자. */
//	@Override
//	public void method() {}									// 정상
	
	/* 같은 범위의 예외를 던져주는 구문으로 오버라이딩은 가능하다. */
//	@Override
//	public void method() throws IOException {}				// 정상
	
	/* 더 상위의 예외를 던지게 오버라이딩 할 수 없다. */
//	@Override
//	public void method() throws Exception {}				// 비정상 (컴파일 에러 발생)
	
	/* 하위의 예외를 던지게 오버라이딩은 가능하다. */
//	@Override
//	public void method() throws FileNotFoundException {}	// 정상
}



