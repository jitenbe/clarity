package com.hex.clarity.core.enums;

public enum ErrorMessage {

	NO_DATA("No Data Found"),
	SAVE_FAILED("Data not saved successfully");
	private String message;

	private ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


}
