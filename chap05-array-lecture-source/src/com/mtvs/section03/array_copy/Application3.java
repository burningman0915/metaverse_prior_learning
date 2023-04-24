package com.mtvs.section03.array_copy;

import java.util.Arrays;

public class Application3 {
	public static void main(String[] args) {
		
		/*
		 * 깊은 복사는 원본과 사본 중 둘 중 한가지 값을 변경해도 다른 하나에 영향을 주지 않는다.
		 * 같은 값을 지니고 있지만 다른 배열이기 때문이다.
		 * 
		 * 이러한 깊은 복사의 특성을 이용하는 자바 구문을 살펴보자.
		 */
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1.clone();
		
		/* arr1 배열의 각 값을 10씩 증가 시켜보자. */
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;
		}
		
		System.out.println(Arrays.toString(arr1));
		
		/* 우리도 Arrays.toString(배열)처럼 출력되게 해 보자. */
		printArray(arr1);
		
		printArray(arr2);
		
		/* for-each문(jdk 1.5)으로 진행해 보자. */
		/*
		 * for-each문(향상된 for문)은 배열의 처음부터 끝까지 돌아가면서 배열 안에 있는 값을
		 * 하나의 변수에 저장해서 편하게 사용하기 위해 만들어졌다.(인덱스 개념 안써도 됨)
		 */
		System.out.println();
		for(int i : arr1) {
			System.out.print(i + " ");
		}
	}

	private static void printArray(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			if(i == 0) System.out.print("[");
//			if(i != (arr.length -1)) System.out.print(arr[i] + ", ");
//			else {
//				System.out.print(arr[i]);
//				System.out.print("]");
//			}
//		}
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i != (arr.length -1)) System.out.print(arr[i] + ", ");
			else System.out.print(arr[i]);
		}
		System.out.print("]");
	}
}







