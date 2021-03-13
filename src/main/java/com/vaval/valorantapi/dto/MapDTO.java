package com.vaval.valorantapi.dto;

import com.vaval.valorantapi.entities.Map;

public class MapDTO {
	
	private Long id;
	private String name;
	private String description;
	private String coordinates;
	
	public MapDTO() {
	}
	
	public MapDTO(Map map) {
		this.id = map.getId();
		this.name = map.getName();
		this.description = map.getDescription();
		this.coordinates = map.getCoordinates();
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

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
}
