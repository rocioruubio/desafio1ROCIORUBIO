package com.example.desafio1RRL.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.desafio1RRL.dao.ClienteDAOI;
import com.example.desafio1RRL.entities.Cliente;

@Service
public class ClienteServiceImpl implements ClienteServiceI {
	
	@Autowired
	private ClienteDAOI clientedaoi;
	
	@Override
	public void insertar(Cliente cliente) {
		clientedaoi.insertar(cliente);
	}

	@Override
	public List<Cliente> consultar_todos() {
		
		return clientedaoi.consultar_todos();
	}

	@Override
	public Cliente consultarID(Long idcliente) {
		return clientedaoi.consultarID(idcliente);
	}

	@Override
	public void eliminar(Cliente cliente) {
		clientedaoi.eliminar(cliente);
		
	}

	@Override
	@Transactional
	public void actualizar(Cliente cliente) {
		clientedaoi.actualizar(cliente);
		
	}
	

}
