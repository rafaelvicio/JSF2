package br.com.stefanini.dao;

import javax.persistence.EntityManager;

public class DAO<T> {
	
	private EntityManager emf;
	private final Class<T> classe;
	
	public DAO(EntityManager emf, Class<T> classe){
		this.emf = emf;
		this.classe = classe;
	}
	
	public void salva(T t){
		emf.getTransaction().begin();
		emf.persist(t);
		emf.getTransaction().commit();
		emf.close();
	}
	
	public void remove(T t) {
		emf.getTransaction().begin();
		emf.remove(emf.merge(t));
		emf.getTransaction().commit();
		emf.close();
	}
	
	public void atualiza(T t){
		emf.getTransaction().begin();
		emf.merge(t);
		emf.getTransaction().commit();
		emf.close();
	}

}
