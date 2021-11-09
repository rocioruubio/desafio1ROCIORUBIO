package com.example.desafio1RRL.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	private Long id_cliente;
	
	private String nombre;
	
	private String p_apellido;
	
	private String s_apellido;
	
	private String dni;
	
	private List<Contrato> contratos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE", precision = 15)
	public Long getId() {
		return id_cliente;
	}

	public void setId(Long id) {
		this.id_cliente = id;
	}
	
	@Column(name = "NOMBRE", precision = 50)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "P_APELLIDO", precision = 50)
	public String getP_apellido() {
		return p_apellido;
	}

	public void setP_apellido(String p_apellido) {
		this.p_apellido = p_apellido;
	}
	
	@Column(name = "S_APELLIDO", precision = 50)
	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}
	
	@Column(name = "DNI", precision = 9, nullable = false, unique = true)
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
}
