package com.mtvs.section02.dimensional_array;

public class Application2 {
	public static void main(String[] args) {
		
		/* 가변 배열을 선언 및 할당하고 차례로 값을 대입해서 출력해 보자. */
		int[][] iArr = new int[3][];
		
		iArr[0] = new int[3];
		iArr[1] = new int[2];
		
		int[] arr = new int[5];
		iArr[2] = arr;				// 미리 할당 된 1차원 배열을 활용할 수도 있다.
		
		/* 반복문을 활용한 값 대입 및 출력 */
		int value = 0;
		
		/* 대입 */
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = ++value;
			}
		}
		
		/* 출력 */
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
