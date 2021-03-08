package com.vaval.valorantapi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaval.valorantapi.entities.Agent;

public interface AgentRepository extends JpaRepository<Agent, UUID> {
	
}
