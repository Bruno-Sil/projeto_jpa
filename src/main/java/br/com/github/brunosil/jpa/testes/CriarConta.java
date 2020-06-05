package br.com.github.brunosil.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.github.brunosil.jpa.modelo.Conta;

public class CriarConta {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
		EntityManager em = emf.createEntityManager(); //Atua como uma fábrica para enapsular toda a lógica de criação
		                                              // E criar o EntityMananger.
		
		Conta conta = new Conta();
		conta.setTitular("Bruno");
		conta.setNumero(1313);
		conta.setAgencia(2255);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();

  }
}