package com.mtvs.section02.extend.run;

import com.mtvs.section02.extend.Bunny;
import com.mtvs.section02.extend.DrunkenBunny;
import com.mtvs.section02.extend.Mammal;
import com.mtvs.section02.extend.Rabbit;
import com.mtvs.section02.extend.RabbitFarm;
import com.mtvs.section02.extend.WildCardFarm;

public class Application2 {
	public static void main(String[] args) {
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
		/* 농장 객체 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다. */
//		wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//		wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));
		
		/* <?>: 제한 없음(제네릭 클래스의 인스턴스라면 다 받아 주겠다.) */
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		
		/* <? extends Type>: 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성된 인스턴스만 인자로 사용 가능) */
//		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
//		wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		
		/* <? super Type>: 와일드카드의 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능) */
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
//		wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
	}
}





