package com.digitalinnovation.personapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalinnovation.personapi.dto.required.PersonDTO;
import com.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import com.digitalinnovation.personapi.entity.Person;
import com.digitalinnovation.personapi.mapper.PersonMapper;
import com.digitalinnovation.personapi.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
		
	private final PersonMapper personMapper;

	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		
		Person personToSave = personMapper.toModel(personDTO);
		
		Person savedPerson = personRepository.save(personToSave);
		
		return MessageResponseDTO
				.builder()
				.message("Created person with ID " + savedPerson.getId())
				.build();
	}
	
}
