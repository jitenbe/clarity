package com.hex.clarity.core.exception;

import java.util.Date;

import com.hex.clarity.core.enums.ErrorMessage;

public class ErrorDetails {
	private ErrorMessage message;

	public ErrorDetails(ErrorMessage message) {
		super();
		this.message = message;

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Error :");
		sb.append(message.getMessage());
		return sb.toString();

	}

}
