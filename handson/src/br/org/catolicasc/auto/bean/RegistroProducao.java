package br.org.catolicasc.auto.bean;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
public class RegistroProducao implements IBean {
	
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private PostoProducao posto;
	@ManyToOne
	private Ordens ordem;
	@ManyToOne
	private Status status;
	@ManyToOne
	private Produto produto;
	private double quantidade;
	private Date TimeStamp;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PostoProducao getIdPosto() {
		return posto;
	}
	public void setPosto(PostoProducao posto) {
		this.posto = posto;
	}
	public Ordens getOrdem() {
		return ordem;
	}
	public void setOrdem(Ordens ordem) {
		this.ordem = ordem;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
}
