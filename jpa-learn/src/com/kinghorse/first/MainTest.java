package com.kinghorse.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		//1.����EntityManagerFactory
		String persistenceUnitName = "jpa-learn";
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(persistenceUnitName);
		
		//2.����EntityManager
		EntityManager entityManager = factory.createEntityManager();
		
		//3.��������
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		//4.���г־û�����
		Customer customer = new Customer("Tom", "Tom@163.com", 20);
		
		entityManager.persist(customer);
		
		//5.�ύ����
		transaction.commit();
		
		//6.�ر�EntityManager
		entityManager.close();
		
		//7.�ر�EntityManagerFactory
		factory.close();
	}

}
