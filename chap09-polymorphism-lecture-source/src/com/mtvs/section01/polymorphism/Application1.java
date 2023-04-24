package com.mtvs.section01.polymorphism;

public class Application1 {
	public static void main(String[] args) {
		System.out.println("Animal 생성 ---------------");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		System.out.println("Rabbit 생성 ---------------");
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		System.out.println("Tiger 생성 ---------------");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		
		/* 다형성 적용 */
		/*
		 * Rabbit과 Tiger는 Animal 클래스를 상속 받았다.
		 * 따라서 Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 하며
		 * Tiger 역시 Tiger 타입이면서 Animal 타입이기도 하다.
		 */
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
		/* 부모타입이 자식타입으로 대입되지는 않는다. */
//		Rabbit r = new Animal();
//		Tiger t = new Animal();
		
		System.out.println("동적바인딩이 적용된 것 ---------------");
		a1.cry();
		a2.cry();
		
		/*
		 * 현재 레퍼런스 변수의 타입은 Animal이기 때문에 자신이 가지지 않은 메소드는 동작시키지 못한다.
		 * (정적바인딩(Animal 타입)으로만 판단하기 때문에)
		 */
//		a1.jump();
//		a2.bite();
		
		System.out.println("클래스 타입 형변환 -----------------");
		
		/*
		 * 객체별로 고유한 기능(오버라이딩 안하고 추가한 메소드)을 동작시키기 위해서는 레퍼런스 변수를
		 * 형변환하여 Rabbit과 Tiger로 변경해야 메소드 호출이 가능하다.
		 * 
		 * Class Type Casting: 클래스 형변환
		 */
		((Rabbit)a1).jump();
		((Tiger)a2).bite();
		
		/*
		 * 클래스 형변환을 잘못 하는 경우
		 * 컴파일 시에는 문제가 되지 않지만 런타임 시 ClassCastException이 발생한다.
		 * (굉장히 위험한 런타임 에러에 속한다.개발 시 인지하지 못함)
		 */
//		((Tiger)a1).bite();
//		((Rabbit)a2).jump();
		
		/*
		 * 레퍼런스 변수가 참조하는 실제 인스턴스가 확인을 원하는 타입과 일치하는 연산자
		 * instanceof를 활용
		 */
		System.out.println("instanceof 확인 ---------------------");
		System.out.println("a1이 Tiger 타입인지 확인: " + (a1 instanceof Tiger));
		System.out.println("a1이 Rabbit 타입인지 확인: " + (a1 instanceof Rabbit));
		
		/* 상속 받은 타입도 함께 가지고 있다. */
		System.out.println("a1이 Animal 타입인지 확인: " + (a1 instanceof Animal));
		
		/* instanceof 연산자를 이용해서 해당 타입이 맞는 경우만 해당 타입으로 클래스 형변환을 적용하자. */
		if(a1 instanceof Rabbit) {
			((Rabbit)a1).jump();
		}
		
		if(a1 instanceof Tiger) {
			((Tiger)a1).bite();
		}
		
		/*
		 * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 * up-casting: 상위 타입으로 형변환
		 * down-casting: 하위 타입으로 형변환
		 */
		Animal animal1 = (Animal)new Rabbit();		// up-casting
		
		/* 묵시적 형변환 */
		Animal animal2 = new Rabbit();				// 묵시적 형변환 가능(다형성)
		
		/* 명시적 형변환 */
		Rabbit rabbit1 = (Rabbit)animal1;			// down-casting
//		Rabbit rabbit2 = animal2;					// 묵시적 형변환 불가능(다형성 적용 X)
		
		
		/* 상속과 오버라이딩의 이점을 가져간 다형성 적용 코드 맛보기 */
		System.out.println("=========================");
		Animal[] animalArr = new Animal[3];
		animalArr[0] = new Animal();
		animalArr[1] = new Rabbit();
		animalArr[2] = new Tiger();
		
		for(int i = 0; i < animalArr.length; i++ ) {
			animalArr[i].eat();
			animalArr[i].run();
			animalArr[i].cry();
			
			if(animalArr[i] instanceof Rabbit) {
				((Rabbit)animalArr[i]).jump();
			}
			
			if(animalArr[i] instanceof Tiger) {
				((Tiger)animalArr[i]).bite();
			}
			System.out.println();
		}
	}
}

