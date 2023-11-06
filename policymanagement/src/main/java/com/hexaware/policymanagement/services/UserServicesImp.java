package com.hexaware.policymanagement.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.policymanagement.entities.User;

public class UserServicesImp implements IUserServices {

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserById(int user_id) {
		User u1 = new User(1,"a","a","a",1,"a","a",null,null);
		return u1;
	}

	@Override
	public List<User> getAllUser() 
	{
		List<User> getAllUser = new ArrayList<>();
		getAllUser.add(new User(1,"a","a","a",1,"a","a",null,null));
		return getAllUser;
	}

}
