package com.hibernate.test;

import com.hibernate.model.Address;
import com.hibernate.model.Employee;
import com.hibernate.service.EmployeeService;
import com.hibernate.util.HibernateUtils;

public class HibernateTest {
	public static void main(String s[]) {
		try {
			Address homeaddress = new Address("add01", "34", "weird street", "shitty area", "fucked-up city");
			Address officeAddress = new Address("add02", "341", "weird office street", "shitty office area",
					"i hate work");
			Employee employee = new Employee("popo", "244", homeaddress);
			// Employee emp = EmployeeService.getEmployee("123");
			// Address officeAddress = new Address("341","weird office street","shitty
			// office area","i hate work");
			// emp.setOfficeAddress(officeAddress);
			EmployeeService.addEmployee(employee);
		} catch(Exception e){
			throw new RuntimeException(e);
		}finally {
		//	HibernateUtils.shutdown();
		}
	}
}
