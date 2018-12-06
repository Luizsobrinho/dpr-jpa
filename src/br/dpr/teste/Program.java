package br.dpr.teste;
//import br.dpr.modelo.Clientedao;
import br.dpr.modelo.Produto;

//import java.util.List;

import br.dpr.controlerdao.JpaUtil;
//import br.dpr.modelo.Cliente;
import br.dpr.dao.Produtodao;

public class Program {

	public static void main(String[] args) {

//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DPR_JPA");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction tx = manager.getTransaction();
//		
		/*Cliente cliente = new Cliente();
		cliente.setNome("Sabrina Elza Pietra Campos - teste");
		cliente.setCpf("420.758.855-83");
		cliente.setEmail("sabrinaelzapietracampos_@asconinternet.com.br");
		cliente.setTelefone("(79) 98826-6284");
		System.out.println("Salvando no banco....");*/
		
//		Clientedao dao = new Clientedao();
//		Cliente c = dao.buscarPorPropiedade("cpf", "420.758.855-83");
//		System.out.println(c);
//		
//		dao = new Clientedao();
//		List<Cliente> lista = dao.lista("nome or a=a --", "desc");
//		lista.stream().forEach(cliente -> System.out.println(cliente));
		
		Produto produto = new Produto();
		produto.setNome("Itaipava Pilsen Lata 350 ml 12 Unidades");
		produto.setQuantidade(350);
		produto.setValor(23.00);
		
		Produtodao dao = new Produtodao();
		dao.adicionar(produto);
		JpaUtil.closeEntityManagerFactory();
//		tx.begin();
//		manager.persist(cliente);
//		tx.commit();
//		
//		manager.close();
//		System.out.println(cliente);
//		
//		factory.close();
		
//		EntityManager entityManager = JpaUtil.getEntityManager();
//		entityManager.getTransaction().begin();
//		entityManager.persist(cliente);
//		entityManager.getTransaction().commit();
//		System.out.println(cliente);
//		entityManager.close();
		
	}

}
