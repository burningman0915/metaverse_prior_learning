package com.mtvs.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception {

	public NotEnoughMoneyException() {}
	
	public NotEnoughMoneyException(String message) {
		super(message);
	}
}
