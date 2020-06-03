package br.com.github.brunosil.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriaTabelas {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("titular");
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();
	}

}
