package hawaiimodelos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Carrinho extends Produto{
	

	@Transient
	public void adicionarProduto(Produto a) { 
		
	}

	@Transient
	public void removerProduto(Produto a) { 
		
	}

}
