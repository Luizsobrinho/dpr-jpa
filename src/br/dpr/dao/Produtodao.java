package br.dpr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.dpr.controlerdao.JpaUtil;
import br.dpr.modelo.Produto;

public class Produtodao {

	private EntityManager entityManager;

	public Produtodao() {
		this.entityManager = JpaUtil.getEntityManager();
	}

	public void adicionar(Produto produto) {
		
		EntityTransaction transacao = entityManager.getTransaction();

		try {

			transacao.begin();
			entityManager.persist(produto);
			transacao.commit();
		} catch (Exception e) {

			transacao.rollback();
			System.out.println("Erro ao salvar: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
