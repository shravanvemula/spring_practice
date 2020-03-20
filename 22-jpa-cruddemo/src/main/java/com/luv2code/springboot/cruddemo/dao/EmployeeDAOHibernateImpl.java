package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		Session session=entityManager.unwrap(Session.class);
		
		Query<Employee> query=session.createQuery("from Employee",Employee.class);
		
		List<Employee> employees=query.getResultList();
		
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				
				// get the employee
				Employee theEmployee =
						currentSession.get(Employee.class, theId);
				
				// return the employee
				return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				
				// save employee
				currentSession.saveOrUpdate(theEmployee);
		
	}

	@Override
	public void deleteById(int theId) {
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
						
				Employee emp=currentSession.get(Employee.class, theId);
				currentSession.delete(emp);
				// delete object with primary key
//				Query theQuery = 
//						currentSession.createQuery(
//								"delete from Employee where id=:employeeId");
//				theQuery.setParameter("employeeId", theId);
				
		
	}

}
