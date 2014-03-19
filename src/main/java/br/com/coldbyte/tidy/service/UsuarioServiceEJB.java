package br.com.coldbyte.tidy.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.coldbyte.tidy.service.UsuarioService;
import br.com.coldbyte.tidy.service.generic.AbstractPersistence;
import br.com.coldbyte.tidy.model.Usuario;

@Stateless
public class UsuarioServiceEJB extends AbstractPersistence<Usuario, Long> 
implements UsuarioService{

	public UsuarioServiceEJB() {
		super(Usuario.class);
	}
	
}
