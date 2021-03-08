package com.vaval.valorantapi.dto;

import com.vaval.valorantapi.entities.Abilities;
import com.vaval.valorantapi.entities.enums.Slot;

public class AbilitiesDTO {
	
	private Long id;
	private String name;
	private String description;
	private Slot slot;
	
	public AbilitiesDTO() {
	}

	public AbilitiesDTO(Abilities abilities) {
		super();
		this.id = abilities.getId();
		this.name = abilities.getName();
		this.description = abilities.getDescription();
		this.slot = abilities.getSlot();
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

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}
}
