package br.com.coldbyte.tidy.service;

import javax.ejb.Local;

import br.com.coldbyte.tidy.model.Usuario;
import br.com.coldbyte.tidy.service.generic.GenericService;

@Local
public interface UsuarioService extends GenericService<Usuario, Long> {

}