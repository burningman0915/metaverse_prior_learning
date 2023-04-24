package com.mtvs.section04.parameter;

import java.util.Arrays;

public class ParameterTest {

	public void testPrimitiveTypeParameter(int num) {
		System.out.println("매개변수로 전달 받은 값: " + num);
	}

	public void testPrimitiveTypeArrayParameter(int[] iArr) {
		System.out.println("매개변수로 전달 받은 값: " + Arrays.toString(iArr));
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
	}

	public void testClassTypeParameter(Rectangle r1) {
		System.out.println("매개변수로 전달 받은 값: " + r1);
		
		r1.setWidth(100);
		r1.setHeight(200);
		
		r1.calcArea();
		r1.calcRound();
	}

	/*
	 * 가변인자는 타입 뒤에 .을 세개 붙여 표시하는 매개변수
	 * 해당 타입의 값을 0개 이상 받거나 아니면 해당 타입의 배열의 주소값을 받을 수 있는 매개변수이기도 하다.
	 * 가변인자는 반드시 매개변수 선언 마지막에 작성해야 한다.
	 */
	public void testVariableLengthArrayParameter(String name, String... hobby) {
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
		
		System.out.println("이름: " + name + ", 취미의 갯수: " + hobby.length
				           + ", 취미: " + Arrays.toString(hobby));
	}
}
