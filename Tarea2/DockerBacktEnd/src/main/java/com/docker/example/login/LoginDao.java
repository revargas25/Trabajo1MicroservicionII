/**
 * 
 */
package com.docker.example.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.docker.example.conexion.ConexionMySQL;

/**
 * @author rafael.e.vargas
 *
 */
public class LoginDao {
	public static String crearLogin(Login login) {
		String respuesta = "Error";
		ConexionMySQL sql = new ConexionMySQL();
		// Llamas al método que tiene la clase y te devuelve una conexión
		Connection conn = sql.conectarMySQL();
		// Query que usarás para hacer lo que necesites
		String sSQL = "INSERT INTO dockertest.LOGINES (usuario, clave) VALUES (?, ?)";
		System.out.println(sSQL);
		// PreparedStatement
		try {
			
			PreparedStatement preparedStatement = conn.prepareStatement(sSQL);
			preparedStatement.setString(1, login.getUsuario());
			preparedStatement.setString(2, login.getClave());
			preparedStatement.executeUpdate();
			respuesta = login.getNick();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return respuesta;
	}
}
