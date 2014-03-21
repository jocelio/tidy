package br.com.coldbyte.tidy.controller;

import javax.inject.Named;

@Named
public class TesteBean {
	//teste
	private String boasVindas = "Welcome to a new Wildfly";

	public String getBoasVindas() {
		return boasVindas;
	}

	public void setBoasVindas(String boasVindas) {
		this.boasVindas = boasVindas;
	}
	

}
