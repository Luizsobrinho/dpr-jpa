package br.dpr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.dpr.controlerdao.JpaUtil;
import br.dpr.modelo.Cliente;

public class Clientedao {

	private EntityManager entityManager;
	
	public Clientedao() {
		this.entityManager = JpaUtil.getEntityManager();
	}
	
	public void adicionar(Cliente cliente) {
		
		EntityTransaction transacao = entityManager.getTransaction();
		
		try {
		
			transacao.begin();
			entityManager.persist(cliente);
			transacao.commit();		
		}catch (Exception e) {
			
			transacao.rollback();
			System.out.println("Erro ao salvar: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public Cliente buscarPorPropiedade(String atributo, Object valor) {
		
		Cliente c = null;
		
		try {
		
			TypedQuery<Cliente> query = entityManager.createQuery("select c from Cliente c where c." + atributo + "= :valor", Cliente.class);
			query.setParameter("valor", valor);
			return query.getSingleResult();
		}catch (Exception e) {
			
			System.out.println("Erro ao buscarPorPropiedade: " + e.getMessage());
			e.printStackTrace();
		}	
		
		return c;
	}
	
	public List<Cliente> lista(String criterio, String order) {
		
		try {
		
		TypedQuery<Cliente> query = entityManager.createQuery("select c from Cliente c order by " + criterio + " " + order, Cliente.class);
			//query.setParameter("criterio", criterio);
			//query.setParameter("o", order);
			return query.getResultList();
		}catch (Exception e) {
			
			System.out.println("Erro ao listar: " + e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
