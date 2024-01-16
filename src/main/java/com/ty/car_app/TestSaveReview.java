package com.ty.car_app;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveReview {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Review review=new Review();
		
		review.setSubject("hindi");
		review.setContent("first lesson");
		
		review.setWriterName("sufhiyan");
		
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
	}

}
