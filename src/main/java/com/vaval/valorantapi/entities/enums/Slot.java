package com.vaval.valorantapi.entities.enums;

public enum Slot {
	
	ABILITY1('Q'),
	ABILITY2('E'),
	ABILITY3('C'),
	ABILITY4('X');
	
	private char code;
	
	private Slot(char code) {
		this.code = code;
	}
	
	public char getCode() {
		return code;
	}
}
