package com.capg.chalo.exception;

import lombok.Data;

@Data
//@AllArgsConstructor
public class CustomException extends RuntimeException{
	
	public CustomException(String Driver) {
		super(Driver);
	}
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
