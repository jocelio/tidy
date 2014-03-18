package br.com.coldbyte.tidy.controller;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.coldbyte.tidy.service.UsuarioService;
import br.com.coldbyte.tidy.model.Usuario;

@Named
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 6725229799210502043L;
	
	@Inject
	private Usuario usuario;
	
	@Inject
	private UsuarioService service;
	
	public String salva(){
		service.salva(usuario);
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
