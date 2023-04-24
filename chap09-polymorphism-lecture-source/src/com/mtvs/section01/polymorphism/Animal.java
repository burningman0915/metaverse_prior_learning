package com.mtvs.section01.polymorphism;

public class Animal {

	public Animal() {
		super();
	}
	
	/* 동물은 기본적으로 먹는 행동과 뛰는 행동, 우는 행동을 할 수 있다. */
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	public void run() {
		System.out.println("동물이 달려갑니다.");
	}
	
	public void cry() {
		System.out.println("동물이 울음소리를 냅니다.");
	}
}
