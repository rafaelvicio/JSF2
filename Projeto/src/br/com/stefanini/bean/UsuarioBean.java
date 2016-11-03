package br.com.stefanini.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.stefanini.dao.DAO;
import br.com.stefanini.modelo.Usuario;
import br.com.stefanini.util.JPAUtil;

public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	
	private DAO<Usuario> dao;
	
	private EntityManager emf = new JPAUtil().getEntityManager();
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Usuario getUsusario() {
		return usuario;
	}
	
	public void cadastrar(){
		System.out.println("Cadastrando Usuario: " + this.usuario.getNome());
		
		new DAO<Usuario>(emf, Usuario.class).salva(usuario);
		this.usuario = new Usuario();
		
	}

}
