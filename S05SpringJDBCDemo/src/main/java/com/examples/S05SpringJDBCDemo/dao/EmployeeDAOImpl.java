package com.examples.S05SpringJDBCDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJDBCDemo.entity.Employee;
import com.examples.S05SpringJDBCDemo.rowmapper.EmployeeRowMapper;

@Component("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {

		String sql = "insert into employee values (?,?,?)";
    	
    	int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstname(),employee.getLastname());
    	
		return result;
	}

	@Override
	public int update(Employee employee) {
		
		String sql = "update employee set firstname=?, lastname=? where id=?";
    	
    	int result = jdbcTemplate.update(sql,employee.getFirstname(),employee.getLastname(),employee.getId());
    	
		return result;
	}

	@Override
	public int delete(int id) {

		String sql = "delete from employee where id = ?";
    	
    	int result = jdbcTemplate.update(sql,id);
    	
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql,employeeRowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(sql,employeeRowMapper);
		return employees;
	}

}
