package com.mtvs.section05.typecasting;

public class Application4 {
	public static void main(String[] args) {

		/* 형변환 사용 시 주의할 점 */
		/* 데이터 손실에 유의해서 사용해야 한다. */
		/* 1. 의도하지 않은 데이터 손실 */
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println("iNum: " + iNum);		// 290
		System.out.println("bNum: " + bNum);		// 34
		
		/* 2. 의도한 데이터 손실 */
		double height = 175.5;
		int floorHeight = (int)height;
		
		System.out.println("height: " + height);
		System.out.println("floorHeight: " + floorHeight);
		System.out.println("버림을 위한 java api 사용: " + (int)Math.floor(height));
	}
}
