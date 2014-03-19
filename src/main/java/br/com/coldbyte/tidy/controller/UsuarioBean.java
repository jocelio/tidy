package br.com.coldbyte.tidy.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.coldbyte.tidy.service.UsuarioService;
import br.com.coldbyte.tidy.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 6725229799210502043L;
	
	@Inject
	private Usuario usuario;
	
	@Inject
	private UsuarioService usuarioService;
	
	private List<Usuario> usuarios;
	
	@PostConstruct
	public void init(){
		usuarios = usuarioService.buscarTodos();
	}
	
	public String salvar(){
		usuarioService.salvar(usuario);
		return "";
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
