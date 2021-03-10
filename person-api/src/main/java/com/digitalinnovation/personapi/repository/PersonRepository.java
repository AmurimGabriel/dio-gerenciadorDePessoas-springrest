package com.digitalinnovation.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalinnovation.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
