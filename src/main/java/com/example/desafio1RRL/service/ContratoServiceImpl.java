package com.example.desafio1RRL.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio1RRL.dao.ClienteDAOI;
import com.example.desafio1RRL.dao.ContratoDAOI;
import com.example.desafio1RRL.entities.Contrato;

@Service
public class ContratoServiceImpl implements ContratoServiceI {
	
	@Autowired
	private ContratoDAOI contratoDAO;
	
	@Override
	public void insertar(Contrato contrato) {
		contratoDAO.insertar(contrato);
		
	}

	@Override
	public List<Contrato> consultar_todos() {
		return contratoDAO.consultar_todos();
	}

	@Override
	public Contrato consultarID(Long idcontrato) {
		return contratoDAO.consultarID(idcontrato);
	}

	@Override
	public void eliminar(Contrato contrato) {
		contratoDAO.eliminar(contrato);
	}

	@Override
	@Transactional
	public void actualizar(Contrato contrato) {
		contratoDAO.actualizar(contrato);
	}

}
