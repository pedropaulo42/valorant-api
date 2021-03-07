package com.vaval.valorantapi.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	private String name;
	private String description;
	
	private Role role;
	private List<Abilities> abilities = new ArrayList<>();
	
	public Agent(UUID id, String name, String description, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.role = role;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<Abilities> getAbilities() {
		return abilities;
	}
}
