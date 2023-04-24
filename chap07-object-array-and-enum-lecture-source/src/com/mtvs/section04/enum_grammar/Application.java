package com.mtvs.section04.enum_grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		
		UserRole1 admin = UserRole1.ADMIN;
		System.out.println(admin.toString());
		System.out.println(admin.getNameToLowerCase());
		
		
		/* 
		 * 최초 enum타입을 사용할 시 생성자가 호출된다.
		 * 하지만 이것이 동적으로 생성되는 것을 의미하는 것은 아니다.
		 */ 
		UserRole2 consumer = UserRole2.CONSUMER;
		System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());
		
		/* 최초 사용시에만 열거 타입의 인스턴스를 생성하고 이후에는 생성자를 호출하지 않는다. */
		UserRole2 consumer2 = UserRole2.CONSUMER;
		
		/* 인스턴스는 싱글톤으로 관리되기 때문에 동일비교 연산으로 비교가 가능하다. */
		System.out.println(consumer == consumer2);
		
		System.out.println("==========================================");
	}

}
