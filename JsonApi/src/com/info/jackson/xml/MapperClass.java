package com.info.jackson.xml;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MapperClass {
	
public static void main(String[] args) throws JAXBException {
	Employee employee = new Employee();
employee.setEmpName("vits");
employee.setEmpNo(1000);
employee.setSalary(20000d);

	JAXBContext context = JAXBContext.newInstance(Employee.class);

	Marshaller marshaller = context.createMarshaller();
//step1
marshaller.marshal(employee, System.out);

	//step2
	
	/*File file=new File("emp.xml");
	marshaller.marshal(employee, file);
	System.out.println("Run");*/
	
	//step3
/*	StringWriter writer;
	marshaller.marshal(context, writer);*/
}
}
