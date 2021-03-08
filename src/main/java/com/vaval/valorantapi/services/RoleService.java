package com.vaval.valorantapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vaval.valorantapi.dto.RoleDTO;
import com.vaval.valorantapi.entities.Role;
import com.vaval.valorantapi.repositories.RoleRepository;

@Service
public class RoleService {
	
	private RoleRepository repository;
	
	public List<RoleDTO> findAll() {
		List<Role> list = repository.findAll();
		return list.stream().map(x -> new RoleDTO(x)).collect(Collectors.toList());
	}
}
