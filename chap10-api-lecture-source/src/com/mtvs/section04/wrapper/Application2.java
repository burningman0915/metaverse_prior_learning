package com.mtvs.section04.wrapper;

public class Application2 {
	public static void main(String[] args) {
		
		/* parsing: 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다. */
//		byte b = Byte.parseByte("1");
//		short s = Short.parseShort("2");
//		int i = Integer.parseInt("4");
//		long l = Long.parseLong("8");					// 8L은 안됨
//		float f = Float.parseFloat("4.0f");				// 4.0f는 됨
//		double d = Double.parseDouble("8.0");
//		boolean isTrue = Boolean.parseBoolean("true");
		
		byte b = Byte.valueOf("1");
		short s = Short.valueOf("2");
		int i = Integer.valueOf("4");
		long l = Long.valueOf("8");						// 8L은 안됨
		float f = Float.valueOf("4.0f");				// 4.0f는 됨
		double d = Double.valueOf("8.0");
		boolean isTrue = Boolean.valueOf("true");
		
		char c = "한".charAt(0);		// char형은 Wrapper 클래스에서 제공해 주지 않아 String의 charAt()을 활용
		
		System.out.println(l);
		System.out.println(f);
	}
}
