package com.vaval.valorantapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaval.valorantapi.dto.MapDTO;
import com.vaval.valorantapi.entities.Map;
import com.vaval.valorantapi.repositories.MapRepository;

@Service
public class MapService {
	
	@Autowired
	private MapRepository repository;
	
	public List<MapDTO> findAll() {
		List<Map> list = repository.findAll();
		return list.stream().map(x -> new MapDTO(x)).collect(Collectors.toList());
	}
}
