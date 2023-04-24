package com.mtvs.section01.array;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		
		/*
		 * 배열이란?
		 * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
		 * 배열은 heap 영역에 new 연산자를 이용하여 크기를 할당한다.
		 */
		
		/*
		 * 배열을 사용하는 이유
		 * 
		 * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.(변수명이 여러개)
		 * 1. 연속된 메모리 공간으로 관리할 수 없다.
		 * 2. 반복문을 이용한 연속 처리가 불가능하다.
		 * 
		 * 반복문을 돌려 짧은 코드로 효율적으로 관리할 수 있다.
		 */
		
		/*
		 * 변수 5개에 값을 저장한다.
		 * 이 때 사용자(개발자)는 변수의 이름을 모두 알아야 한다.
		 */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		/* 변수의 값을 누적해서 저장하기 위한 용도의 변수 sum */
		int sum = 0;
		
		/* 다른 변수의 이름 때문에 반복문도 사용하지 못하고 일일이 더해 줘야 한다. */
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		System.out.println("합계: " + sum);
		
		/* 배열을 이용해 보자. */
		/* 배열의 선언 및 할당 */
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		/* int형 5칸의 배열에 각각 값을 대입하는 작업을 반복문을 활용해서 진행해 보자.(i를 index의 개념으로 작성하자.) */
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (i + 1) * 10;
//		}
		
//		System.out.println(Arrays.toString(arr));
		
		/* 마찬가지로 반복문을 활용하여 배열에 들어있는 값을 반복문을 통해 출력해 보자. */
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}














