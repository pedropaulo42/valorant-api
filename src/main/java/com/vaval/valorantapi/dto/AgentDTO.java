package com.vaval.valorantapi.dto;

import com.vaval.valorantapi.entities.Agent;

public class AgentDTO {
	
	private Long id;
	private String name;
	private String description;
//	private Role role;
//	private List<Abilities> abilities = new ArrayList<>();
	
	public AgentDTO() {
	}

	public AgentDTO(Agent agent) {
		this.id = agent.getId();
		this.name = agent.getName();
		this.description =  agent.getDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
//	public Role getRole() {
//		return role;
//	}
//
//	public void setRole(Role role) {
//		this.role = role;
//	}

//	public List<Abilities> getAbilities() {
//		return abilities;
//	}
}
