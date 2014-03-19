package br.com.coldbyte.tidy.service.generic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import br.com.coldbyte.tidy.model.AbstractEntity;

public abstract class AbstractPersistence<T extends AbstractEntity, PK extends Number> {
	
	private Class<T> entityClass;
	
	@PersistenceContext
	private EntityManager em;
	
	public AbstractPersistence(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	protected EntityManager getEntityManager(){
		return em;
	}
	
	public T salvar(T entity){
		if(entity.getId() == null){
			return getEntityManager().merge(entity);
		}else{
			getEntityManager().persist(entity);
			return entity;
		}
	}
	
	public void remover(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}
	
	public T buscar(PK id) {
		return getEntityManager().find(entityClass, id);
	}
	
	public List<T> buscarTodos(){
		CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
	}
	
}
