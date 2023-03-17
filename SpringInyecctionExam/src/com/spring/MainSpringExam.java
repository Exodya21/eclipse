package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.Profesor;

public class MainSpringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// abre el contexto a partir del archivo de configuración 
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// obtener el bean por constructor
		Profesor entrenador = context.getBean("miProfesorInformatica", Profesor.class); 
		System.out.println(entrenador.getExperiencia());
		
		// obtener el bean por setter
		Profesor entrenador2 = context.getBean("miProfesorMates"
				, Profesor.class); 
		System.out.println(entrenador2.getExperiencia());
		
		// obtener el bean
		Profesor entrenador3 = context.getBean("miProfesorOrientacion", 
				Profesor.class); 
		System.out.println(entrenador3.getEmail());
		System.out.println(entrenador3.getEquipo()); 
		
		// obtener el bean por datos properties
//				Entrenador entrenador4 = context.getBean("mientrenador4", 
//						Entrenador.class); 
//				System.out.println(entrenador4.getEmail());
//				System.out.println(entrenador4.getEquipo());
//				System.out.println(entrenador4.getJugadores());  
		
		// cierra el context
		context.close();
	}

}
