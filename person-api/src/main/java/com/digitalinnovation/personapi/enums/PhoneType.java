package com.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
	
	HOME("Home"),
	MOBILE("Mobile"),
	COMMECRIAL("Commercial");
	
	private final String description;

	private PhoneType(String description) {
		this.description = description;
	}
}
