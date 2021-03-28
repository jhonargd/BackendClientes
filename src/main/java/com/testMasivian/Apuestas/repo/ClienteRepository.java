package com.testMasivian.Apuestas.repo;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.testMasivian.Apuestas.model.Cliente;

@Repository
public class ClienteRepository implements RedisRepository {
	private RedisTemplate< Integer, Cliente> redisTemplate;
	private HashOperations hashOperation;
	
	public ClienteRepository(RedisTemplate< Integer, Cliente> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	@PostConstruct
	private void init() {
		hashOperation = redisTemplate.opsForHash();
	}
	@Override
	public Map<Integer, Object> findAll(String key) {
		return hashOperation.entries(key);
	}
	@Override
	public Object findById(int id, String key) {
		return (Cliente) hashOperation.get(key, id);
	}
	@Override
	public void save(Object object, String key) {
		Cliente cliente = (Cliente) object;
		hashOperation.put(key,cliente.getNmCliente(), (Cliente) object);
	}
	@Override
	public void delete(int id, String key) {
		hashOperation.delete(key, id);
	}
}
