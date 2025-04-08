package com.vita.libraries.model;

public class ResponseModel {

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public int getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getExceptionDescription() {
		return exceptionDescription;
	}

	public void setExceptionDescription(String exceptionDescription) {
		this.exceptionDescription = exceptionDescription;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private ResponseModel(Builder builder) {
		this.obj = builder.obj;
		this.exceptionCode = builder.exceptionCode;
		this.exceptionDescription = builder.exceptionDescription;
		this.message = builder.message;
	}

	private Object obj;

	private int exceptionCode;

	private String exceptionDescription;

	private String message;

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
