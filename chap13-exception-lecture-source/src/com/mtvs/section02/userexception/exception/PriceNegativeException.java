package com.mtvs.section02.userexception.exception;

public class PriceNegativeException extends Exception {

	public PriceNegativeException() {
		super();
	}
	
	public PriceNegativeException(String message) {
		super(message);
	}

}
