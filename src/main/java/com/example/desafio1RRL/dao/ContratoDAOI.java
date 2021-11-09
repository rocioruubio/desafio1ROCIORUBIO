package com.example.desafio1RRL.dao;

import java.util.List;

import com.example.desafio1RRL.entities.Contrato;

public interface ContratoDAOI {
	public void insertar (Contrato contrato);
	
	public List<Contrato> consultar_todos();
	
	public Contrato consultarID (Long idcontrato);
	
	public void eliminar (Contrato contrato);
	
	public void actualizar (Contrato contrato);
}
