package br.com.github.brunosil.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.github.brunosil.jpa.modelo.Conta;
import br.com.github.brunosil.jpa.modelo.Movimentacao;
import br.com.github.brunosil.jpa.modelo.TipoMovimentacao;

public class TestaRelacionamento {
    public static void main(String args[]) {
    	
    	Conta conta = new Conta();
    	conta.setAgencia(123456);
    	conta.setNumero(125125);
    	conta.setSaldo(300.00);
    	conta.setTitular("Rosangela");
    	
    	Movimentacao mov = new Movimentacao();
    	mov.setData(LocalDateTime.now());
    	mov.setDescricao("Loja");
    	mov.setValor(new BigDecimal(200.00));
    	mov.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(conta);
    	em.persist(mov);
    	em.getTransaction().commit();
    	
    	em.close();
    }
}
