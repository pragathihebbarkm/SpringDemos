package com.examples.S05SpringJDBCDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJDBCDemo.dao.EmployeeDAO;
import com.examples.S05SpringJDBCDemo.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
     
    	System.out.println("JDBCTemplate demo");
    	
    	//create();
    	//update();
    	//delete();
    	
    	readAllEmployees();
    	readOneEmployee();
    	
    }

	private static void readOneEmployee() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringJDBCDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		
		Employee employee = employeeDao.read(1);
		System.out.println(employee);
		
	}

	private static void readAllEmployees() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringJDBCDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		
		List<Employee> employees = employeeDao.read();
		System.out.println(employees);
		
	}

	private static void delete() {
		
				ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringJDBCDemo/springconfig.xml");
				EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
				
				employeeDao.delete(2);
	}

	private static void update() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringJDBCDemo/springconfig.xml");
		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
    	
    	Employee emp = new Employee();
    	emp.setId(2);
    	emp.setFirstname("Shree");
    	emp.setLastname("Hari");
    	
    
    	employeeDao.update(emp);
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/S05SpringJDBCDemo/springconfig.xml");
    	
    	EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
    	
    	Employee emp = new Employee();
    	emp.setId(2);
    	emp.setFirstname("Radha");
    	emp.setLastname("Krishna");
    	
    	employeeDao.create(emp);
    	
	}
}
