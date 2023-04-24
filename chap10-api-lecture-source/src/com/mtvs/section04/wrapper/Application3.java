package com.mtvs.section04.wrapper;

public class Application3 {
	public static void main(String[] args) {
		
		/* parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우도 할 수 있다.(중요하지 X) */
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(4).toString();
		String l = Long.valueOf(8L).toString();
		String f = Float.valueOf(4.0f).toString();
		String d = Double.valueOf(8.0).toString();
		String isTrue = Boolean.valueOf(true).toString();
		String c = Character.valueOf('a').toString();
		
		/* 문자열 합치기의 원리를 이용하면 모든 기본 자료형은 쉽게 String으로 변환할 수 있다. */
		String str = 8L + "";
		
		long lNum = 2300000000L;
		float fNum = 4.0f;
	}
}






