package projetojpa.relatorio;

import java.util.List;

import hawaiimodelos.Produto;

public class Relatorio {

	  private Double maiorPreco = Double.NEGATIVE_INFINITY;
	  private Double menorPreco = Double.POSITIVE_INFINITY;
	  
	  public void getRelatorioPrecos (List<Produto> produtos) {
		  for (Produto produto : produtos) {
			  if (produto.getValor() > maiorPreco)
				  maiorPreco = produto.getValor();
			  if(produto.getValor()< menorPreco) {
				  menorPreco = produto.getValor();
			  }
		  }
		  
	  }

	   public Double getMaiorPreco() {
		   return maiorPreco;
	   }

	public Double getMenorPreco() {
		return menorPreco;
	}

	

	   
}
