package br.com.coldbyte.tidy.service.generic;

import java.util.List;


public interface GenericService<T, PK> {
	
	public T salvar(T entity);
	
	public void remover(T entity);
	
	public T buscar(PK id);
	
	public List<T> buscarTodos();
}
