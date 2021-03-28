package com.testMasivian.Apuestas.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testMasivian.Apuestas.ApuestasApplication;
import com.testMasivian.Apuestas.model.Cliente;
import com.testMasivian.Apuestas.repo.ClienteRepository;
import com.testMasivian.Apuestas.util.Util;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	private ClienteRepository clienteRepository;
	private ApuestasApplication dir;
	public static final String KEY = "Cliente";
	
	public ClienteController(ClienteRepository clienteRepository) {
		this.dir = new ApuestasApplication();
		this.clienteRepository = clienteRepository;
	}
	
	//@CrossOrigin(origins = "http://localhost:4201")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONArray findAll(){
		JSONArray  newMap2 = new JSONArray();
		try{
			Map<Integer,Object> map = clienteRepository.findAll(KEY); 
		    for (Map.Entry<Integer, Object> entry : map.entrySet()) {
		        try{
		        	Cliente cliente = (Cliente) map.get(entry.getKey());
		        	dir.insert(cliente);
		        	newMap2.add(cliente);
		        }
		        catch(ClassCastException e){
		            System.out.println("ERROR: "+entry.getKey()+" -> "+entry.getValue()+
		                               " not added, as "+entry.getValue()+" is not a String");
		        }
		    }
		} catch(ClassCastException e){
            System.out.println(e.getMessage());
		}
		
		return newMap2;
	}
	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		dir.insert(cliente);
		if(clienteRepository.findById(cliente.getNmCliente(), KEY) == null) {
			clienteRepository.save(cliente, KEY);
		}else {
			clienteRepository.delete(cliente.getNmCliente(), KEY);
			clienteRepository.save(cliente, KEY);
		}
		
		return cliente;
	}
	
	@GetMapping("/{id}")
	public Cliente findById(@PathVariable String id){
		Cliente cliente = dir.search(id);
		//Cliente cliente = (Cliente) clienteRepository.findById(id, KEY);
		return cliente;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteCliente(@PathVariable int id){
		Cliente cliente = (Cliente) clienteRepository.findById(id, KEY);
		clienteRepository.delete(cliente.getNmCliente(), KEY);
		return true;
	}

}
