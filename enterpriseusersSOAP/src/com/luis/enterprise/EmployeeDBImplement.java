package com.luis.enterprise;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.jws.WebService;
import javax.swing.JOptionPane;

@WebService(endpointInterface = "com.luis.enterprise.EmployeeDB")
public class EmployeeDBImplement implements EmployeeDB {
	
	private PreparedStatement ps;
	private Connection con;
	private Conexion conex = new Conexion();
	private int res;
	private String msj;

	@Override
	public String setEmployee(Employee employee) {
		String sql = "insert into employee(name, lastname, documentType, document, birth, vinculation, position, salary)values(?,?,?,?,?,?,?,?)";
		
		try {
			con = conex.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getLastname());
			ps.setString(3, employee.getDocumentType());
			ps.setString(4, employee.getDocument());
			ps.setString(5, employee.getPosition());
			ps.setString(6, employee.getSalary());
			ps.setString(7, employee.getVinculation());
			ps.setString(8, employee.getBirth());
			
			res = ps.executeUpdate();
			
			msj = res == 1 ? "Usuario agregado" : "Error";
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la inserión de la BD: " + e.getMessage());
		}
		
		System.out.println(msj);
		
		return msj;
	}

}
