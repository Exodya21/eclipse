package com.animales.examen3;

public class Delfin extends Animales {

	int ojosCount = 1;
	int aletasCount = 4;
	
	public int getOjosCount() {
		return ojosCount;
	}
	public void setOjosCount(int ojosCount) {
		this.ojosCount = ojosCount;
	}
	
	public int getAletasCount() {
		return aletasCount;
	}
	public void setAletasCount(int aletasCount) {
		this.aletasCount = aletasCount;
	}
	
	public void nadar() {
		System.out.println("A nadarrr");
	}
	
	public void expulsarAwa() {
		System.out.println("Fuuuuuuussh");
	}
}
