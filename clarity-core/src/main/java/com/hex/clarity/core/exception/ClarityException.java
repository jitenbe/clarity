package com.hex.clarity.core.exception;

import com.hex.clarity.core.enums.ErrorMessage;

public class ClarityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private ErrorMessage errorMessage;

	public ClarityException() {
		super();
	}

	public ClarityException(ErrorMessage errorMessage, Throwable throwable) {
		super(throwable);
		this.errorMessage = errorMessage;
	}

	public ClarityException(ErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;

	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

}
