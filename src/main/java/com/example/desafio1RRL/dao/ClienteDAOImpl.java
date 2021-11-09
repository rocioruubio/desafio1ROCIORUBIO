package com.example.desafio1RRL.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.desafio1RRL.entities.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAOI {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		session.save(cliente);
		session.close();
	}

	@Override
	public List<Cliente> consultar_todos() {
		Session session = entityManager.unwrap(Session.class);
		
		List<Cliente> listaClientes = (List<Cliente>) session.createQuery("FROM Cliente").getResultList();
		
		session.close();
		return listaClientes;
	}

	@Override
	public Cliente consultarID(Long idcliente) {
		Session session = entityManager.unwrap(Session.class);
		
		Cliente cliente = (Cliente) session.createQuery("FROM Cliente WHERE ID_CLIENTE = "+ idcliente).uniqueResult();
		
		session.close();
		return cliente;
	}

	@Override
	public void eliminar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(cliente);
		session.close();
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(cliente);
		session.close();
	}
	
}
