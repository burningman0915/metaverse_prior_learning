package com.mtvs.section02.extend.run;

import com.mtvs.section02.extend.Bunny;
import com.mtvs.section02.extend.DrunkenBunny;
import com.mtvs.section02.extend.Mammal;
import com.mtvs.section02.extend.Rabbit;
import com.mtvs.section02.extend.RabbitFarm;
import com.mtvs.section02.extend.Snake;

public class Application1 {
	public static void main(String[] args) {
		
		/* Animal 타입으로는 제네릭 클래스의 인스턴스 생성이 불가능하다.(인터페이스는 안됨) */
//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();
		
		/* Mammal 타입으로는 제네릭 클래스의 인스턴스 생성이 불가능하다.(Rabbit 또는 Rabbit의 자식 클래스가 아니면 안됨) */
//		RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
		
		/* 상속관계가 아닌 전혀 다른 타입을 이용해서도 제네릭 클래스 인스턴스 생성이 불가능하다. */
//		RabbitFarm<Snake> farm3 = new RabbitFarm<>();
		
		/* Rabbit 타입이나 Rabbit의 후손 타입으로는 인스턴스 생성이 가능하다.(제네릭을 걸 수 있다.) */
		RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm5 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm6 = new RabbitFarm<>();
		
		/* setter를 이용할 때도 올바른 타입의 인스턴스를 인자로 전달해야 한다. */
//		farm4.setAnimal(new Snake());
		
		/* farm4 농장은 다형성에 의해 Rabbit타입 객체는 모두 set이 가능하다. */
		farm4.setAnimal(new DrunkenBunny());
		farm4.setAnimal(new Bunny());
		
		/* farm5 농장은 DrunkenBunny타입 객체만 set 가능 */
		farm5.setAnimal(new DrunkenBunny());
//		farm5.setAnimal(new Bunny());
		
		/* farm6 농장은 Bunny타입 객체만 set 가능 */
//		farm6.setAnimal(new DrunkenBunny());
		farm6.setAnimal(new Bunny());
		
		/* 우리가 배운 개념을 토대로 이해하자. */
		farm4.setAnimal(new Bunny());
//		((DrunkenBunny)farm4.getAnimal()).cry();	// 자식 클래스로 다운캐스팅은 런타임 에러를 발생 시킬 수도 있다.
		
//		if(farm4.getAnimal() instanceof Bunny) {
//			((Bunny)farm4.getAnimal()).cry();
//		} else {
//			((DrunkenBunny)farm4.getAnimal()).cry();
//		}
		
		farm4.getAnimal().cry();		// 상속, 다형성, 오버라이딩, 제네릭, 동적바인딩까지 활용해서 형변환에 신경쓰지 않고 실행한 구문
		farm5.getAnimal().cry();
		farm6.getAnimal().cry();
	}
}







