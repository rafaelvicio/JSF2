package br.com.stefanini.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Projeto");
	
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}

}
