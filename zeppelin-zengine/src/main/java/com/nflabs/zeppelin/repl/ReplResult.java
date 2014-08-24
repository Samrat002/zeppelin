package com.nflabs.zeppelin.repl;

public class ReplResult {
	public static enum Code {
		SUCCESS,
		INCOMPLETE,
		ERROR
	}
	
	Code code;
	String msg;
	
	public ReplResult(Code code) {
		this.code = code;
		this.msg = null;
	}
	
	public ReplResult(Code code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Code code(){
		return code;
	}
	
	public String message(){
		return msg;
	}
}
