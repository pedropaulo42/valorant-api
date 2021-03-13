package com.vaval.valorantapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaval.valorantapi.entities.Map;

public interface MapRepository extends JpaRepository<Map, Long> {

}
