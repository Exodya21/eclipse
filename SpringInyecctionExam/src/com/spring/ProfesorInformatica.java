package com.spring;

import com.spring.interfaces.ExperienciaServicio;
import com.spring.interfaces.Profesor;

public class ProfesorInformatica implements Profesor {
	
	
	
	private ExperienciaServicio experienciaServicio; 
	@Override
	public String getEntrenamiento() { 
		return "Lanzar 30 tiros a canasta";
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyección del servicio en un método setter
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) { 
		System.out.println("Inyección en un método setter"); 
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setEquipo(String equipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getJugadores() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setJugadores(int jugadores) {
		// TODO Auto-generated method stub
		
	}
}

