package br.com.stefanini.dao;

import javax.persistence.EntityManager;

import br.com.stefanini.modelo.Usuario;
import br.com.stefanini.util.JPAUtil;

public class UsuarioDAO {
	
private EntityManager emf = new JPAUtil().getEntityManager();
	
	private DAO<Usuario> dao;

}
