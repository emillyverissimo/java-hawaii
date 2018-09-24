package hawaiimodelos;

public enum FormaPagamento {

	CARTAO(1), BOLETO(2);
	
	private final int valor;
	FormaPagamento(int valorForma){
		valor = valorForma;
	}
	public int getValor() {
		return valor;
	}
}
