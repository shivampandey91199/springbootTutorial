package com.Dao;

import java.util.ArrayList;

import com.model.user;

public class ResponseDao {

	public static ArrayList<user> users = new ArrayList<>();
	static {

		user u1 = new user();
		u1.setName("Shivam");
		u1.setEmail("shivam@gmail.com");
		u1.setPassword("Shivam@123");
		users.add(u1);

		user u2 = new user();
		u2.setName("Shiv");
		u2.setEmail("shiv@gmail.com");
		u2.setPassword("Shiv@123");
		users.add(u2);

	}
}
