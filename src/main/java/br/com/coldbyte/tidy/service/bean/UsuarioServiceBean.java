package br.com.coldbyte.tidy.service.bean;

import javax.ejb.Stateless;


import br.com.coldbyte.tidy.service.generic.GenericPersistence;
import br.com.coldbyte.tidy.model.Usuario;

@Stateless
public class UsuarioServiceBean extends GenericPersistence<Usuario, Long> {

	public UsuarioServiceBean() {
		super(Usuario.class);
	}
	
}
