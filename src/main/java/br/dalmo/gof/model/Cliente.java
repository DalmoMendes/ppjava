package br.dalmo.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String fone; // Novo
	private String email; // Novo
	private String link; // Novo
	@ManyToOne
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public String getFone() {
		return fone;
	}
	public String getEmail() {
		return email;
	}
	public String getLink() {
		return link;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
