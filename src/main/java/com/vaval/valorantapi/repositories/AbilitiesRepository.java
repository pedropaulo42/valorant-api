package com.vaval.valorantapi.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaval.valorantapi.entities.Abilities;

public interface AbilitiesRepository extends JpaRepository<Abilities, UUID> {

}
