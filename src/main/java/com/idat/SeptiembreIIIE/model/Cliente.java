package com.idat.SeptiembreIIIE.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCLiente;
	private String cliente;
	private String celular;
	
	//muchos a muchos
	@ManyToMany(mappedBy= "clientes", cascade = {CascadeType.PERSIST,CascadeType.MERGE}) //copiamos "clientes" de producto
	private List<Producto> productos = new ArrayList<>();
	
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Item> items = new ArrayList<>();
	
	
	
	
	public Integer getIdCLiente() {
		return idCLiente;
	}
	public void setIdCLiente(Integer idCLiente) {
		this.idCLiente = idCLiente;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	

}
