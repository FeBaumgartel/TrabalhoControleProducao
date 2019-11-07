package br.org.catolicasc.auto.bean;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class RegistroProducao implements IBean {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Status status;
	private Date TimeStamp;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
}
