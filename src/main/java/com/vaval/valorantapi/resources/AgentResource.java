package com.vaval.valorantapi.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaval.valorantapi.domain.Agent;

@RestController
@RequestMapping(value = "/agents")
public class AgentResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Agent>> findAll() {
		List<Agent> listAgent = new ArrayList<>();
		
		Agent raze = new Agent(UUID.randomUUID(), "Raze", "balbal");
		Agent jett = new Agent(UUID.randomUUID(), "Jett", "balbal");
		
		listAgent.addAll(Arrays.asList(raze, jett));
		return ResponseEntity.ok().body(listAgent);
	}
}
