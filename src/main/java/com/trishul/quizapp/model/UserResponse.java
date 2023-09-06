package com.trishul.quizapp.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserResponse {
	private Integer id;
	private String response;
	
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResponse() {
		return this.response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
}
