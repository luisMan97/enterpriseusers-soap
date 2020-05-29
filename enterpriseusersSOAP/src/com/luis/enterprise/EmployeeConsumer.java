package com.luis.enterprise;

public class EmployeeConsumer {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setBirth("xsz");
		employee.setDocument("dsd");
		employee.setDocumentType("dasd");
		employee.setLastname("dsad");
		employee.setName("Jorge");
		employee.setPosition("dasd");
		employee.setSalary("dsad");
		employee.setVinculation("dsadsa");
		
		EmployeeDBImplementService employeedb = new EmployeeDBImplementService();
		EmployeeDB consumer = employeedb.getEmployeeDBImplementPort();
		consumer.setEmployee(employee);
	}

}
