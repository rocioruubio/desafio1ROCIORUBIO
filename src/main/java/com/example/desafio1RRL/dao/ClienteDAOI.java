package com.example.desafio1RRL.dao;

import java.util.List;

import com.example.desafio1RRL.entities.Cliente;

public interface ClienteDAOI {
	
	public void insertar (Cliente cliente);
	
	public List<Cliente> consultar_todos();
	
	public Cliente consultarID (Long idcliente);
	
	public void eliminar (Cliente cliente);
	
	public void actualizar (Cliente cliente);
}
