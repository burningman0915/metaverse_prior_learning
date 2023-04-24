package com.mtvs.section02.extend;

public class RabbitFarm<T extends Rabbit> {		// 제네릭 타입 변수인 T를 Rabbit 타입 이하로 제한

	private T animal;

	public RabbitFarm() {
	}
	public RabbitFarm(T animal) {
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
}
