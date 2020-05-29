package com.luis.enterprise;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
	
	private Connection con;
	private String driver = "com.mysql.jdbc.Driver";
	private String connection = "jdbc:mysql://localhost:3306/enterprise";
	private String user = "root";
	private String password = ""; // 12345678
	
	public Conexion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(connection, user, password);
			//JOptionPane.showMessageDialog(null, "Conectado a la BD");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage());
		}
	}
	
	public Connection getConnection() {
		return con;
	}

}
