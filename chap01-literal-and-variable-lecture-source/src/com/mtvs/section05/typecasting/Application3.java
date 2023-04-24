package com.mtvs.section05.typecasting;

public class Application3 {
	public static void main(String[] args) {
		
		/* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산 */
		/* 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 된 후 연산처리 된다. */
		int iNum = 10;
		long lNum = 100;
		
		/* 방법 1. 두 수의 연산 결과를 int 자료형으로 강제 형변환 한다.*/
		int iResult1 = (int)(iNum + lNum);
		
		/* 방법 2. long형 값을 int로 강제 형변환 한다. */
		int iResult2 = iNum + (int)lNum;
		
		/* 방법 3. 결과 값을 long형으로 받는다.(자동 형변환 이용) */
		long lResult = iNum + lNum;
		
		/* byte와 short의 연산에 주의하자.(특이 케이스)(어떤 경우든 int가 된다.) */
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		int result1 = byteNum1 + byteNum2;
		int result2 = byteNum1 + shortNum2;
		int result3 = shortNum1 + byteNum2;
		int result4 = shortNum1 + shortNum2;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		
		/* 실제 평균을 구할 때 활용하게 되는 예제 */
		int kor = 90;
		int eng = 60;
		int mat = 50;
		
//		double avg = (double)(kor + eng + mat) / 3;
//		double avg = (kor + eng + mat) / (double)3;
		double avg = (kor + eng + mat) / 3.0;
		
		System.out.println("평균: " + avg);
	}
}






