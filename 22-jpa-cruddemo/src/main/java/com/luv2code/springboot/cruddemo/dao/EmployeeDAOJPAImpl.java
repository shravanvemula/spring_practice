package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJPAImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override

	public List<Employee> findAll() {
		

		
	Query query=entityManager.createQuery("from Employee");
		
		List<Employee> employees=query.getResultList();
		
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		
				// get the employee
				Employee theEmployee =entityManager.find(Employee.class,theId);
				
				
				// return the employee
				return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		// get the current hibernate session
		
				// save employee
				Employee dbEmployee=entityManager.merge(theEmployee);
				
				theEmployee.setId(dbEmployee.getId());
				
		
	}

	@Override
	public void deleteById(int theId) {
		// get the current hibernate session
//				Session currentSession = entityManager.unwrap(Session.class);
//						
//				Employee emp=currentSession.get(Employee.class, theId);
//				currentSession.delete(emp);
//				// delete object with primary key
			Query theQuery = 
					entityManager.createQuery(
							"delete from Employee where id=:employeeId");
			theQuery.setParameter("employeeId", theId);
			theQuery.executeUpdate();
				
		
	}

}
