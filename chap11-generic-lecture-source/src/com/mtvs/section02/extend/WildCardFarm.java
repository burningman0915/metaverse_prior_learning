package com.mtvs.section02.extend;

public class WildCardFarm {		// 농장을 넘기면 농장안의 동물을 꺼내 울려보는 기능을 지닌 클래스
	
	/*
	 * 와일드카드(?)란
	 * 제네릭 클래스의 객체를 메소드의 매개변수로 받을 시 객체의 타입 변수를 제한하는 것
	 */
	
	/* 와일드 카드로 농장 제네릭 객체들에 대한 제한을 걸어보자. */
	
	/* 어떤 토끼가 있는 농장이던 토끼 농장은 다 받아 주겠다. */
	public void anyType(RabbitFarm<?> farm) {
		farm.getAnimal().cry();
	}
	
	/* 토끼가 Bunny이거나 그 후손 타입만 존재하는 토끼 농장만 매개변수로 받아 주겠다. */
	public void extendsType(RabbitFarm<? extends Bunny> farm) {	// Bunny만 뛰어노는 농장만 가능
		farm.getAnimal().cry();
	}
	
	/* 토끼가 Bunny이거나 그 부모 타입만 존재하는 토끼 농장만 매개변수로 받아 주겠다. */
	public void superType(RabbitFarm<? super Bunny> farm) {		// Bunny이상인데 애초에 RabbitFarm 객체가 Rabbit이하라 Rabbit또는 Bunny가 뛰어노는 농장만 가능(DrunkenBunny가 있는 농장은 X)           
		farm.getAnimal().cry();
	}
}
