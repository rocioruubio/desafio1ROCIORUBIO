package com.example.desafio1RRL.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.desafio1RRL.entities.Cliente;
import com.example.desafio1RRL.entities.Contrato;

@Repository
public class ContratoDAOImpl implements ContratoDAOI {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		session.save(contrato);
		session.close();
		
	}

	@Override
	public List<Contrato> consultar_todos() {
		Session session = entityManager.unwrap(Session.class);
		
		List<Contrato> listaContrato = (List<Contrato>) session.createQuery("FROM Contrato").getResultList();
		
		session.close();
		return listaContrato;
	}

	@Override
	public Contrato consultarID(Long idcontrato) {
		Session session = entityManager.unwrap(Session.class);
		
		Contrato contrato = (Contrato) session.createQuery("FROM Cliente WHERE ID_CLIENTE = "+ idcontrato).uniqueResult();
		
		session.close();
		return contrato;
	}

	@Override
	public void eliminar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(contrato);
		session.close();		
	}

	@Override
	public void actualizar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(contrato);
		session.close();		
	}

}
