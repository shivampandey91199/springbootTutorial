package com.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.userDao;
import com.user.user;

@RestController
public class userController {

	@GetMapping("/user")
	public List<user> getAllUser() {
		return userDao.users;
	}

	@PostMapping("/addUser")
	public user addUser(@RequestBody user user) {
		userDao.users.add(user);
		return user;
	}

	@GetMapping("/user/{uID}")
	public user getUserById(@PathVariable("uID") int uID) {
		for (int i = 0; i < userDao.users.size(); i++) {
			if (userDao.users.get(i).getuID() == uID) {
				return userDao.users.get(i);
			}
		}
		return null;
	}

	@DeleteMapping("/deleteUser/{uID}")
	public user deleteUserById(@PathVariable("uID") int uID) {
		user user = null;
		for (user u : userDao.users) {
			if (u.getuID() == uID) {
				user = u;
				break;
			}
		}
		userDao.users.remove(user);
		return user;
	}
}
