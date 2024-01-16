package com.ty.car_app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=new Car();
		car.setId(1);
		car.setName("ford probe");
		car.setBrand("honda");
		car.setType("petroll");
		car.setCost(60000000);
		if(car!=null) {
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		}else {
			System.out.println("car is not there");
		}
	}

}
