package com.kinghorse.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		//1.创建EntityManagerFactory
		String persistenceUnitName = "jpa-learn";
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(persistenceUnitName);
		
		//2.创建EntityManager
		EntityManager entityManager = factory.createEntityManager();
		
		//3.开启事务
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		//4.进行持久化操作
		Customer customer = new Customer("Tom", "Tom@163.com", 20);
		
		entityManager.persist(customer);
		
		//5.提交事务
		transaction.commit();
		
		//6.关闭EntityManager
		entityManager.close();
		
		//7.关闭EntityManagerFactory
		factory.close();
	}

}
