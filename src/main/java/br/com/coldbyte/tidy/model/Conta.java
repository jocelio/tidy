package br.com.coldbyte.tidy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * 
 * @author Stanley Araujo
 *
 */

@Entity
public class Conta implements AbstractEntity {
	
	private static final long serialVersionUID = -7594314817940622655L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_conta")
	private Long id;
	
	private String nome;
	
	@Column(name="valor_atual")
	private Float valorAtual;
	
	@ManyToOne
	@JoinColumn(name="id_banco")
	private Banco banco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(Float valorAtual) {
		this.valorAtual = valorAtual;
	}

	public Long getId() {
		return id;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
