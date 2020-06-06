package br.com.github.brunosil.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.github.brunosil.jpa.modelo.Conta;

public class CriaSaldoConta {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
		EntityManager em = emf.createEntityManager();
		
		Conta contaBruno = em.find(Conta.class, 1L);
		
		em.getTransaction().begin();
		
		contaBruno.setSaldo(500.00);
		
		em.getTransaction().commit();
	}

}
