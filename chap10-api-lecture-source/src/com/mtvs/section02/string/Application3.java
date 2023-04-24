package com.mtvs.section02.string;

import java.util.StringTokenizer;

public class Application3 {
	public static void main(String[] args) {
		
		/* split()과 StringTokenizer() */
		
		/* 1. split() */
		/* 각 문자열의 의미는 사원번호/이름/주소/부서를 의미한다. */
		String emp1 = "100/홍길동/서울/영업부";
		String emp2 = "200/유관순//총무부";
		String emp3 = "300/이순신/경기도/";
		
		String[] empArr1 = emp1.split("/");
		String[] empArr2 = emp2.split("/");
		String[] empArr3 = emp3.split("/");
		
		for(String emp : empArr1) {
			System.out.print(emp + ", ");
		}
		System.out.println();
		
		for(String emp : empArr2) {
			System.out.print(emp + ", ");
		}
		System.out.println();
		
		for(String emp : empArr3) {
			System.out.print(emp + ", ");
		}
		/*
		 * split 메소드 중에 매개변수가 하나인 것은 마지막 구분자 이후 아무 값이 없으면
		 * 한 칸으로 인지하지 않게 되면 다른 값과 달리 배열의 크기도 한 칸이 작게 된다. 
		 */
		
		System.out.println();
		
		/* 2. StringTokenizer */
		// 매개변수 있는 생성자로 구분자를 기준으로 문자열을 토큰 단위로 인식하는 객체 생성
		StringTokenizer st1 = new StringTokenizer(emp1, "/");	    
		StringTokenizer st2 = new StringTokenizer(emp2, "/");
		StringTokenizer st3 = new StringTokenizer(emp3, "/");
		
		while(st1.hasMoreElements()) {
			System.out.println("st1: " + st1.nextToken());
		}
		while(st2.hasMoreElements()) {
			System.out.println("st2: " + st2.nextToken());
		}
		while(st3.hasMoreElements()) {
			System.out.println("st3: " + st3.nextToken());
		}
		
		/* 추가(구분자 여러개일 때) */
		String colors ="red/orange*yellow#green+blue-purple";
		
		String[] colorArr = colors.split("[/*#+-]");
		for(String color : colorArr) {
			System.out.println("color: " + color);
		}
		
		StringTokenizer colorStringTokenizer = new StringTokenizer(colors, "/*#+-");
		while(colorStringTokenizer.hasMoreElements()) {
			System.out.println(colorStringTokenizer.nextToken());
		}
	}
}





