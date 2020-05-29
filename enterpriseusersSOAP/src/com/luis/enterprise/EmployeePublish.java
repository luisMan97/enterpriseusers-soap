package com.luis.enterprise;

import javax.xml.ws.Endpoint;

public class EmployeePublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:1515/soap/employeedb", new EmployeeDBImplement());
	}

}
