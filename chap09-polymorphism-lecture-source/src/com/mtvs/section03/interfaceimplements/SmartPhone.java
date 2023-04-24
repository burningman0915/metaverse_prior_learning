package com.mtvs.section03.interfaceimplements;

import java.io.Serializable;
import java.util.Comparator;

public class SmartPhone extends Product implements Comparator, Serializable{

	@Override
	public void nonStaticMethod() {
		System.out.println("nonStatic 실행되나");
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract 실행");
	}

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}

}
