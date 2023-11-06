package com.hexaware.policymanagement.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.policymanagement.entities.UserPolicy;

public class UserPolicyServicesImp implements IUserPolicyServices {

	@Override
	public boolean createUserPolicy(UserPolicy userpolicy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserPolicy(UserPolicy userpolicy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserPolicy(UserPolicy userpolicy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserPolicy getUserPolicyById(int policy_no) {
		UserPolicy up1 = new UserPolicy(1,1,1,"a","b","c",null,null,"d",1,1,1,1,null,null);
		return up1;
	}

	@Override
	public List<UserPolicy> getAllUserPolicy() 
	{
		List<UserPolicy> getAllUserPolicy = new ArrayList<>();
		getAllUserPolicy.add(new UserPolicy(1,1,1,"a","b","c",null,null,"d",1,1,1,1,null,null));
		
		return getAllUserPolicy;

	}

}
