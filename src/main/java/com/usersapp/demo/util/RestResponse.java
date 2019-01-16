package com.usersapp.demo.util;

public class RestResponse {

	private int responseCode;
	private String mensaje;
	
	public RestResponse() {
		// TODO Auto-generated constructor stub
	}	
	
	public RestResponse(int responseCode, String mensaje) {
		super();
		this.responseCode = responseCode;
		this.mensaje = mensaje;
	}

	public int getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
