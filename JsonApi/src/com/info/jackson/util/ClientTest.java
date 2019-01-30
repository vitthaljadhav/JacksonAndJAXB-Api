package com.info.jackson.util;

import com.info.jackson.Employee;

public class ClientTest {
public static void main(String[] args) {
	Employee employee = new Employee();
employee.setEmpNo(100);
employee.setEmpName("Vitthal Jadhav");
employee.setSalary(20000d);
String response = CoNvertBoth.ConvertJson(employee);
System.out.println(response);
System.out.println("++++===============================================");

Employee emp1 = CoNvertBoth.convertJavaObject(response, Employee.class);
System.out.println(emp1.getEmpNo()+" "+emp1.getEmpName()+" :"+emp1.getSalary());
}
}
