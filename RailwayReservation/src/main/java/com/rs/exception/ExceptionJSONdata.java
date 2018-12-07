package com.rs.exception;

/**
 * @author v2
 *This class is to show show data according to postman with all postman variable
 */
public class ExceptionJSONdata {
	private String timestamp;
	private String message;
	private String details;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ExceptionJSONInfo [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}

}
