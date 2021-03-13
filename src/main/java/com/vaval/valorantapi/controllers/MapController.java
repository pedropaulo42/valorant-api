package com.vaval.valorantapi.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaval.valorantapi.entities.Map;

@RestController
@RequestMapping(value = "/maps")
public class MapController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Map>> findAll() {
		List<Map> list = new ArrayList<>();
		
		Map ascent = new Map(1L, "Ascent", "mapinha", "123");
		Map split = new Map(2L, "Split", "mapinha", "123");
		
		list.addAll(Arrays.asList(ascent, split));
		return ResponseEntity.ok().body(list);
	}
}
