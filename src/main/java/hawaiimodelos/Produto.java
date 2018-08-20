package hawaiimodelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Produto  {

	@Id
	@GeneratedValue
	private Integer codigo;
	
	@Column(length = 60, nullable = false)
	public String nome;
	
	@Column(length = 60, nullable = false)
	public String descricao;
	
	@Column(precision = 10, scale = 2, nullable = false)
	public double qnt;
	
	@ManyToOne
	@JoinColumn(name = "idDepartamento")
	public Departamento departamento;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getQnt() {
		return qnt;
	}
	public void setQnt(double qnt) {
		this.qnt = qnt;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(qnt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		
	Produto other = (Produto) obj;
		
		if (departamento == null) {
			if (other.departamento != null)
				return false;
	
		} else if (!departamento.equals(other.departamento))
			return false;
	
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		
		} else if (!descricao.equals(other.descricao))
			return false;
		
		if (nome == null) {
			if (other.nome != null)
				return false;
		
		} else if (!nome.equals(other.nome))
			return false;
		
		if (Double.doubleToLongBits(qnt) != Double.doubleToLongBits(other.qnt))
			return false;
		
		return true;
		
	}
	
	
	
}
