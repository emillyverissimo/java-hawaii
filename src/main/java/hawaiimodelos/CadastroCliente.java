package hawaiimodelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CadastroCliente extends Loja{
	

	@Id
	@GeneratedValue
	private Integer codigo;

	@Column(length = 60, nullable = false)
	private String nome;
	
	@Column(length = 60, nullable = false)
	private String email;
	
	@Column(length = 60, nullable = false)
	private String senha;
	
 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		
	CadastroCliente other = (CadastroCliente) obj;
		
	
		if (nome == null) {
			if (other.nome != null)
				return false;
	
		} else if (!nome.equals(other.nome))
			return false;
			
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
		
		
		return true;
		
	}
	
	
}
