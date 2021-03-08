package com.vaval.valorantapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaval.valorantapi.entities.Abilities;

@RestController
@RequestMapping(value = "/abilities")
public class AbilitiesController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Abilities>> findAll() {
		List<Abilities> list = new ArrayList<>();
		return ResponseEntity.ok().body(list);
	}
}
