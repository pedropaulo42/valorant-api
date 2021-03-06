package com.vaval.valorantapi.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaval.valorantapi.entities.Agent;

@RestController
@RequestMapping(value = "/agents")
public class AgentController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Agent>> findAll() {
		List<Agent> list = new ArrayList<>();
		
		Agent raze = new Agent(1L, "Raze", "balbal");
		Agent jett = new Agent(2L, "Jett", "balbal");
		
		list.addAll(Arrays.asList(raze, jett));
		return ResponseEntity.ok().body(list);
	}
}
