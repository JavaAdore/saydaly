package com.saydaly.dataacceess.daoimpl;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class AbstractDAO {

  @PersistenceContext(unitName="saydalyPersistenceUnit")
	private EntityManager em;
	
	
	public void test()
	{
		Query query = em.createQuery("select * from Employees");
		List result =query.getResultList();
		System.out.println(result);
	}
	
	
}
