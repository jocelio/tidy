package br.com.coldbyte.tidy.service;

import javax.ejb.Stateless;

import br.com.coldbyte.tidy.service.AbstractPersistence;
import br.com.coldbyte.tidy.service.UsuarioService;
import br.com.coldbyte.tidy.model.Usuario;

@Stateless
public class UsuarioServiceEJB extends AbstractPersistence<Usuario> 
implements UsuarioService{

	@Override
	protected Class getClazz() {
		return Usuario.class;
	}

	public void salva(Usuario usuario){
		
	}
}
