package projetojpa.relatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hawaiimodelos.Produto;

public class Relatorio {

	  private Double maiorPreco = Double.NEGATIVE_INFINITY;
	  private Double menorPreco = Double.POSITIVE_INFINITY;
	  
	  private List<Produto> ProdutosMaisCaros;
	  
	  public void getRelatorioPrecos (List<Produto> produtos) {
		  for (Produto produto : produtos) {
			  if (produto.getValor() > maiorPreco) {
				  maiorPreco = produto.getValor();
			  }
			  if(produto.getValor()< menorPreco) {
				  menorPreco = produto.getValor();
			  }
		  }
		  calcularProdutosMaisCaros(produtos);
		  
	  }

	  public void calcularProdutosMaisCaros(List<Produto> produtos) {
		  ProdutosMaisCaros =new ArrayList<>(produtos);
		  Collections.sort (ProdutosMaisCaros, new Comparator<Produto>() {
				  public int compare (Produto p1, Produto p2) {
			  if (p1.getValor() < p2.getValor()) return 1;
			  if (p1.getValor() > p2.getValor()) return -1;
			  return 0;
		  }
			  
		  } );
		  ProdutosMaisCaros = ProdutosMaisCaros.subList(0,
				  ProdutosMaisCaros.size() > 3 ? 3 : ProdutosMaisCaros.size());
		  
	  }
	   public List<Produto> getProdutosMaisCaros() {
		return ProdutosMaisCaros;
	}

	public Double getMaiorPreco() {
		   return maiorPreco;
	   }

	public Double getMenorPreco() {
		return menorPreco;
	}

	

	   
}
