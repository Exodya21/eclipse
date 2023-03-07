package com.animales.examen3;

public class MainExamen3 {
	public static void main(String[] args) {
		Colibri pajaro = new Colibri();
		pajaro.setName("Pajarillo");
		
		System.out.println( pajaro.getName() +" tiene "+ pajaro.getAlasCount() +" alas y es de color "+ pajaro.getColorPrincipal());
		pajaro.cantar();
		
		
		Leopardo gatito = new Leopardo();
		gatito.setName("Silvestre");
		
		System.out.println( gatito.getName() +" tiene "+ gatito.getOrejasCount() +" orejas y tiene "+ gatito.getManchasCount() +" manchas");
		gatito.caminar();
		
		
		Delfin pescao = new Delfin();
		pescao.setName("Philip");
		
		System.out.println( pescao.getName() +" tiene "+ pescao.getAletasCount() +" aletas y "+ pescao.getOjosCount() +" ojo");
		pescao.nadar();
	}
}
