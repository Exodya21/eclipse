package com.animales.examen3;

public class Animales implements SeresVivos {
	String name;
	
	public void comer() {
		System.out.println("Estoy comiendo");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
