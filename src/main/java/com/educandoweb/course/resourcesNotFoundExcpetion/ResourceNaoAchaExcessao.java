package com.educandoweb.course.resourcesNotFoundExcpetion;

public class ResourceNaoAchaExcessao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNaoAchaExcessao(Object id) {
		super("Id = " + id + ", não encontrado");		
	}
}
