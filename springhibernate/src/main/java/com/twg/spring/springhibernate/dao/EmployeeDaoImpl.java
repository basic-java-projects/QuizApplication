package com.twg.spring.springhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.twg.spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public void save(Employee employee) {
		hibernateTemplate.save(employee);
	}

	@Override
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
	}

	@Override
	public void delete(Employee employee) {
		hibernateTemplate.delete(employee);
	}

	@Override
	public Employee findById(int id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		return hibernateTemplate.loadAll(Employee.class);
		 
	}

}
