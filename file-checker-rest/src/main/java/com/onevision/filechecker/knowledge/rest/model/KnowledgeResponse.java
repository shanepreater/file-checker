package com.onevision.filechecker.knowledge.rest.model;

import lombok.Data;

@Data
public class KnowledgeResponse<T> {
	private ErrorResponse errorResponse;
	
	private T data;
	
	public KnowledgeResponse(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
		this.data = null;
	}
	
	public KnowledgeResponse(T data) {
		this.data = data;
	}
	
	public boolean isError() {
		return errorResponse != null;
	}
	
	public T get() {
		return data;
	}
}
