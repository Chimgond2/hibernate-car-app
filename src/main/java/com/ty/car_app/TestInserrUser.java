package com.ty.car_app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInserrUser {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=new User();
		user.setName("sufhiyan");
		user.setEmail("sufhiyan@gmail.com");
		user.setPassword("123w%jk");
		user.setGender("male");
		if(user!=null) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		}else {
			System.out.println("no user to insert");
		}
	}

}
