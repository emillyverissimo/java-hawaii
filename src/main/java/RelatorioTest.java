import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import hawaiimodelos.Produto;
import projetojpa.relatorio.Relatorio;


public class RelatorioTest {
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemCrescente () {
	
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
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		 
		 
	 }
	
	@Test
	
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemDecrescente () {
		
		 Produto dvd= new Produto ("CCE DVD" , 400.0);
		 Produto tv = new Produto ("Samsung" , 300.0);
		 Produto celular = new Produto ("Moto g500" , 250.0);
		
		
		  
		 List<Produto> produtos = new ArrayList<>();
		 
		 produtos.add(dvd);
		 produtos.add(tv);
		 produtos.add(celular);
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 400.0;
		 Double menorPrecoEsperado = 250.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
	     
	@Test
	
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemAleatorio () {
		
    	Produto tv = new Produto ("Samsung" , 300.0);
    	Produto celular = new Produto ("Moto g500" , 250.0);
    	Produto dvd= new Produto ("CCE DVD" , 400.0);
	
		
		 List<Produto> produtos = new ArrayList<>();
		 
		 produtos.add(tv);
		 produtos.add(celular);
		 produtos.add(dvd);
		 
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 400.0;
		 Double menorPrecoEsperado = 250.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
	

       @Test
	
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemUnica () {
		
    	Produto tv = new Produto ("Samsung" , 300.0);
    	
	
		
		 List<Produto> produtos = new ArrayList<>();
		 
		 produtos.add(tv);
		
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 300.0;
		 Double menorPrecoEsperado = 300.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
       
   	   
}
