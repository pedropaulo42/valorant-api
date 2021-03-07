package com.vaval.valorantapi.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaval.valorantapi.entities.Agent;
import com.vaval.valorantapi.entities.Role;

@RestController
@RequestMapping(value = "/agents")
public class AgentController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Agent>> findAll() {
		List<Agent> listAgent = new ArrayList<>();
		
		Role iniciador = new Role(UUID.randomUUID(), "iniciador", "blablabal");
		Agent raze = new Agent(UUID.randomUUID(), "Raze", "balbal", iniciador);
		Agent jett = new Agent(UUID.randomUUID(), "Jett", "balbal", iniciador);
		
		listAgent.addAll(Arrays.asList(raze, jett));
		return ResponseEntity.ok().body(listAgent);
	}
}