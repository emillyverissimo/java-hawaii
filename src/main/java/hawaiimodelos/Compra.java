package hawaiimodelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Compra extends Carrinho{

	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@Column(name = "nomeCompleto", nullable = false)
	private String nomeCompleto;
	
	@Column(name = "ruaOuAvenida", nullable = false)
	private String ruaOuAvenida;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "pais", nullable = false)
	private String pais;
	
	@Column(name = "cep", nullable = false)
	private String cep;
	
	@Column(name = "Forma de Pagamento", nullable = false)
	@Enumerated(EnumType.STRING)
	private FormaPagamento FormaPagamento;
	
	@Column(name = "telefone", nullable = false)
	private double telefone;
	
	@ManyToOne
	@JoinColumn(name = "idCarrinho")
	public Carrinho listaProdutos;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	
	public FormaPagamento getFormaPagamento() {
		return FormaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		FormaPagamento = formaPagamento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getRuaOuAvenida() {
		return ruaOuAvenida;
	}
	public void setRuaOuAvenida(String ruaOuAvenida) {
		this.ruaOuAvenida = ruaOuAvenida;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Carrinho getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(Carrinho listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		result = prime * result + ((ruaOuAvenida == null) ? 0 : ruaOuAvenida.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
	Compra other = (Compra) obj;
		
		if (email == null) {
			if (other.email != null)
				return false;
	
		} else if (!email.equals(other.email))
			return false;
	
		if (senha == null) {
			if (other.senha != null)
				return false;
		
		} else if (!senha.equals(other.senha))
			return false;
		
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;
		
		} else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		
		if (ruaOuAvenida == null) {
			if (other.ruaOuAvenida!= null)
				return false;
			
			} else if (!ruaOuAvenida.equals(other.ruaOuAvenida))
				return false;

			if (cidade == null) {
				if (other.cidade != null)
					return false;
			
			} else if (!cidade.equals(other.cidade))
				return false;

			if (estado == null) {
				if (other.estado != null)
					return false;
			
			} else if (!estado.equals(other.estado))
				return false;

			if (pais == null) {
				if (other.pais != null)
					return false;
			
			} else if (!pais.equals(other.pais))
				return false;

			if (cep == null) {
				if (other.cep != null)
					return false;
			} else if (!cep.equals(other.cep))
				return false;
			return false;

		
	}
	
}
