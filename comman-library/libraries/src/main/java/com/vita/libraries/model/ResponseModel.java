package com.vita.libraries.model;

public class ResponseModel {

	public Object getObj() {
		return obj;
	}

	public int getExceptionCode() {
		return exceptionCode;
	}


	public String getExceptionDescription() {
		return exceptionDescription;
	}


	public String getMessage() {
		return message;
	}

	private ResponseModel(Builder builder) {
		this.obj = builder.obj;
		this.exceptionCode = builder.exceptionCode;
		this.exceptionDescription = builder.exceptionDescription;
		this.message = builder.message;
	}

	private final Object obj;

	private final int exceptionCode;

	private final String exceptionDescription;

	private final String message;
	
	//create the static factory method 
	public static Builder Builder() {
		return new Builder();
	}

	public static class Builder {

		private Object obj;

		private int exceptionCode = -1;

		private String exceptionDescription = "No exception occured";

		private String message;

		public Builder setObj(Object obj) {
			this.obj = obj;
			return this;
		}

		public Builder setExceptionCode(int code) {
			exceptionCode = code;
			return this;
		}

		public Builder setExceptionDescription(String description) {
			exceptionDescription = description;
			return this;
		}

		public Builder setMessage(String message) {
			this.message = message;
			return this;
		}

		public ResponseModel build() {
			return new ResponseModel(this);
		}
	}

}
