package com.educandoweb.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Instant timestand;
	private Integer status;
	private String error;
	private String mensagem;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Instant timestand, Integer status, String error, String mensagem, String path) {
		super();
		this.timestand = timestand;
		this.status = status;
		this.error = error;
		this.mensagem = mensagem;
		this.path = path;
	}

	public Instant getTimestand() {
		return timestand;
	}

	public void setTimestand(Instant timestand) {
		this.timestand = timestand;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
