package projetojpa.relatorio;

import java.util.ArrayList;
import java.util.List;

import hawaiimodelos.Produto;

public class TesteDoRelatorio {

	 public static void main (String[] args ) {
		 Produto celular = new Produto ("Moto g500" , 250.0);
		 Produto tv = new Produto ("Samsung" , 300.0);
		 Produto dvd= new Produto ("CCE DVD" , 400.0);
		 
		 
		 List<Produto> produtos = new ArrayList<>();
		 produtos.add(celular);
		 produtos.add(tv);
		 produtos.add(dvd);
		 
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 400.0;
		 Double menorPrecoEsperado = 250.0;
		 
		 //imprimir 400.0
		 System.out.println(maiorPrecoEsperado. equals (relatorio.getMaiorPreco()));
		//imprimir 250.0
		 System.out.println(menorPrecoEsperado. equals(relatorio.getMenorPreco()));
	 }
}
