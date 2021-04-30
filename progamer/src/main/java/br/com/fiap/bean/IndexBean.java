package br.com.fiap.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean {
	
	public void execute() {
		System.out.println("funfou");
	}

}
