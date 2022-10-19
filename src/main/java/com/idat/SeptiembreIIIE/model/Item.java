package com.idat.SeptiembreIIIE.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iditem;
	private String item;
	private Integer cantidad;
	private Double total;
	
	
	@ManyToOne
	@JoinColumn(
			name="id_cliente",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey (foreignKeyDefinition = "foreign key (id_cliente) references clientes(id_cliente)")
			)
	private Cliente cliente;
	
	
	
	
	public Integer getIditem() {
		return iditem;
	}
	public void setIditem(Integer iditem) {
		this.iditem = iditem;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
	

}
