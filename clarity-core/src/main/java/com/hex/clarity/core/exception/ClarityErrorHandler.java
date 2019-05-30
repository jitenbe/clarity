package com.hex.clarity.core.exception;

import org.springframework.stereotype.Component;


@Component
public class ClarityErrorHandler {
	public String buildMessage(ClarityException e) {

		return new ErrorDetails(e.getErrorMessage()).toString();

	}

}
