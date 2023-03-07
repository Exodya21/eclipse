package com.animales.examen3;

public class Leopardo extends Animales {

	int orejasCount = 2;
	int manchasCount = 342;
	
	public int getOrejasCount() {
		return orejasCount;
	}
	public void setOrejasCount(int orejasCount) {
		this.orejasCount = orejasCount;
	}

	public int getManchasCount() {
		return manchasCount;
	}

	public void setManchasCount(int manchasCount) {
		this.manchasCount = manchasCount;
	}

	public void caminar() {
		System.out.println("A caminarrr");
	}
	
	public void moverCola() {
		System.out.println("Fush fush");
	}
}
