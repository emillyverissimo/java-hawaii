import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hawaiimodelos.Produto;
import projetojpa.relatorio.Relatorio;


public class RelatorioTest {
	
	private Relatorio relatorio;
	private List<Produto> produtos;
	
	@Before
	public void criaEntidadesParaTestes() {
		relatorio = new Relatorio();
		Produto tv = new Produto ("Samsung" , 300.0);
	  	Produto celular = new Produto ("Moto g500" , 250.0);
	  	Produto dvd= new Produto ("CCE DVD" , 400.0);
	  
	  	 produtos = new ArrayList<>();
		 produtos.add(tv);
		 produtos.add(celular);
		 produtos.add(dvd);
		
	}
	
	
	
	
	@Test
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemCrescente () {
	
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 400.0;
		 Double menorPrecoEsperado = 250.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		 
		 
	 }
	
	@Test
	
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemDecrescente () {
		
	
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 400.0;
		 Double menorPrecoEsperado = 250.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
	     
	@Test
	
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemAleatorio () {
		
 
		 
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 400.0;
		 Double menorPrecoEsperado = 250.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
	

       @Test
	
	public void deveEncontrarOMaiorEMenorPrecoDosProdutosEmOrdemUnica () {
		
		
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 Double maiorPrecoEsperado = 300.0;
		 Double menorPrecoEsperado = 300.0;
		 
		   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
  @Test
  public void deveEncontrarOsTresProdutosMaisCaros() {
	  
	  Produto caneta = new Produto ("Bik" , 1.5);
	  produtos.add(caneta);
		 
		 
		 Relatorio relatorio = new Relatorio();
		 relatorio.getRelatorioPrecos(produtos);
		 
		 
		 List<Produto> top3ProdutosMaisCaros = relatorio.getProdutosMaisCaros();
		 
		 assertEquals(3, top3ProdutosMaisCaros.size());
		 assertEquals(400.0, top3ProdutosMaisCaros.get(0).getValor(), 000.1);
		 assertEquals(300.0, top3ProdutosMaisCaros.get(1).getValor(), 000.1);
		 assertEquals(250.0, top3ProdutosMaisCaros.get(2).getValor(), 000.1);
  }
   
}
