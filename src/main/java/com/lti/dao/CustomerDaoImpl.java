package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager em;

	@Transactional
	public Customer addOrUpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer userPersisted = em.merge(customer);
		return userPersisted;

	}

	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		String jpql = "select u from Customer u";
		TypedQuery<Customer> query = em.createQuery(jpql, Customer.class);

		return query.getResultList();

	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return em.find(Customer.class, customerId);
	}

//	@Transactional
//	public Customer addOrUpdateCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		Customer userPersisted=em.merge(customer);
//		return userPersisted;
//		
//	}

}
