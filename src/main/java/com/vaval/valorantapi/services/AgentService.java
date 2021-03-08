package com.vaval.valorantapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaval.valorantapi.dto.AgentDTO;
import com.vaval.valorantapi.entities.Agent;
import com.vaval.valorantapi.repositories.AgentRepository;

@Service
public class AgentService {
	
	@Autowired
	private AgentRepository repository;
	
	public List<AgentDTO> findAll() {
		List<Agent> list = repository.findAll();
		return list.stream().map(x -> new AgentDTO(x)).collect(Collectors.toList());
	}
}
