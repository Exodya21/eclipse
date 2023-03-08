package com.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Conexión
			Connection conexion = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/banco",
					"banco", "fullstack");
			//Instrucción SQL
			// obtención de un objeto de tipo Statement 
			Statement instruccion = conexion.createStatement();
			// construir sentencia SQL
			String query = "INSERT INTO gestor (usuario, password, correo)"
					+ " VALUES ('gestor9', 'dsjadjdas', 'gestor9@correo.com')";
			// Primera FORMA ejecutar instrucción con el método execute 
			boolean resultado = instruccion.execute(query);
			// si es false, entonces la instrucción no devuelve un objeto de 			// tipo ResultSet 
			if (!resultado) {
			// mostrar el número de registros insertados
				System.out.println("Registros insertados: " +
						instruccion.getUpdateCount());
			}
			// Segunda FORMA ejecutar instrucción con el método executeUpdate
			int registrosInsertados = instruccion.executeUpdate(query);
			// mostrar el número de registros insertados 
			System.out.println("Registros insertados: " + registrosInsertados);
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
		
	}

}
