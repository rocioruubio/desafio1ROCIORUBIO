package com.example.desafio1RRL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio1RRL.entities.Cliente;
import com.example.desafio1RRL.entities.Contrato;
import com.example.desafio1RRL.service.ClienteServiceImpl;
import com.example.desafio1RRL.service.ContratoServiceImpl;

@SpringBootApplication
public class Desafio1RrlApplication implements CommandLineRunner {
	
	@Autowired
	private ClienteServiceImpl clienteService;
	@Autowired
	private ContratoServiceImpl contratoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1RrlApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		Cliente cliente1 = new Cliente();
		Contrato contrato1 = new Contrato();
		List<Contrato> listaContratos = new ArrayList<>();
		List<Cliente> listCliente = new ArrayList<>();

		
		cliente1.setNombre("Rocio");
		cliente1.setP_apellido("Rubio");
		cliente1.setS_apellido("Lado");
		cliente1.setDni("26508998A");
		
		contrato1.setFecha_caducidad("2021-11-11");
		contrato1.setFecha_vigencia("2021-11-03");
		contrato1.setPrecio_mensual(66);
		
		contrato1.setCliente(cliente1);
		listaContratos.add(contrato1);
		cliente1.setContratos(listaContratos);
		
		//insertar clientes
		clienteService.insertar(cliente1);
//		contratoService.insertar(contrato1);
		
		
		
		
		//listar todos los clientes
		/*listCliente = clienteService.consultar_todos();
		for(int i = 0 ; i < listCliente.size(); i++) {
			System.out.println(listCliente.get(i).getNombre());
		}*/
		
		//listar por id
		//System.out.println(clienteService.consultarID((long)1).getNombre());
		
		//modificar clientes
		/*cliente1.setNombre("Marta");
		cliente1.setP_apellido("Rubio");
		cliente1.setS_apellido("Lado");
		cliente1.setDni("26508996R");
		cliente1.setContratos(listaContratos);
		clienteService.actualizar(cliente1);*/
		
		
		
		
		
		//insertar contrato
		
		
		//listar todos los contratos
		/*listaContratos = contratoService.consultar_todos();
		for(int i = 0 ; i < listaContratos.size(); i++) {
			System.out.println(listaContratos.get(i).getId());
		}*/
		
		//listar por id
		//System.out.println(contratoService.consultarID((long)1).getId());
	}
}
