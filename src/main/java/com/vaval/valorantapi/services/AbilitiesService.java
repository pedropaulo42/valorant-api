package com.vaval.valorantapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaval.valorantapi.dto.AbilitiesDTO;
import com.vaval.valorantapi.entities.Abilities;
import com.vaval.valorantapi.repositories.AbilitiesRepository;

@Service
public class AbilitiesService {
	
	@Autowired
	private AbilitiesRepository repository;
	
	public List<AbilitiesDTO> findAll() {
		List<Abilities> list = repository.findAll();
		return list.stream().map(x -> new AbilitiesDTO(x)).collect(Collectors.toList());
	}
}
