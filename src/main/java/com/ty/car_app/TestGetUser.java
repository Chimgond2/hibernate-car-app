package com.ty.car_app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetUser {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select u from User u where u.password=?1 and u.email=?2";
		
		
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "123w%jk");
		query.setParameter(2, "sufhiyan@gmail.com");

		
		List<User> users = query.getResultList();
		if(users.size()>0) {
			User user=users.get(0);
			System.out.println("name "+user.getId());
			System.out.println("email "+user.getEmail());
			System.out.println("password "+user.getGender());
			//System.out.println();
		}else {
			System.out.println("user is not there");
		}
		
		

	}

}
