package br.com.coldbyte.tidy.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractPersistence<T> {

	@PersistenceContext
	private EntityManager em;
	
	protected abstract Class getClazz();
	
	protected EntityManager getEntityManager(){
		return em;
	}
	
	public void salva(T entity){
		getEntityManager().persist(entity);
	}
	
	
}
