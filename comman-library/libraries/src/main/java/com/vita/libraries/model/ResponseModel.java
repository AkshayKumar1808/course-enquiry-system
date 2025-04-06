package com.vita.libraries.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseModel {
	
	private Object obj;
	
	@Builder.Default
	private int exceptionCode=-1;
	
	@Builder.Default
	private String exceptionDescription="No such exception occured";
	
	private String message;
	
}
