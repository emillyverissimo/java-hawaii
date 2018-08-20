package br.projetojpa;

import javax.persistence.EntityManager;

import hawaiimodelos.CadastroCliente;
import hawaiimodelos.Compra;
import hawaiimodelos.Departamento;
import hawaiimodelos.Produto;
import javax.persistence.EntityTransaction;


public class App {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		CadastroCliente cadastroCliente = new CadastroCliente ();
		cadastroCliente.setNome("aSD");
		cadastroCliente.setEmail("SJHDF");
		cadastroCliente.setSenha("CX");
		
		Departamento departamento = new Departamento(); 
		departamento.setNome("Moda Praia");
		departamento.setNome("Pranchas");
		departamento.setNome("Boias");		
		departamento.setNome("Infantil");
		departamento.setNome("Esporte");
		
		
		Produto produto = new Produto();
		produto.setNome("Sei lá");
		produto.setDescricao("oi");
		produto.setQnt(3);
		manager.persist(produto);
		
		Compra compra = new Compra();
		compra.setEmail("chvhfdfghs");
		compra.setSenha("chvhfdf11gs");
		compra.setNomeCompleto("chvhfdfghs");
		compra.setRuaOuAvenida("chvhfdfghs");
		compra.setCidade("Rio Largo");
		compra.setEstado("alagoas");
		compra.setPais("brasil");
		compra.setCep("546636");
		
		
		tx.commit();
		manager.close();
		JPAUtil.close();
		
		
		
	}
}
