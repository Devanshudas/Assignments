package com.hexaware.policymanagement.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.policymanagement.entities.Policy;

public class PolicyServicesImp implements IPolicyServices {

	@Override
	public boolean createPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Policy getPolicyById(int policy_id) {
		Policy p1 = new Policy(1,"a","b","c","d",1,2,3,4,5);
		return p1;
	}

	@Override
	public List<Policy> getAllPolicy() 
	{
		List<Policy> getAllPolicy = new ArrayList<>();
		getAllPolicy.add(new Policy(0,"a","b","c","d",1,2,3,4,5));
		getAllPolicy.add(new Policy(1,"a","b","c","d",1,2,3,4,5));
		
		return getAllPolicy;

	}

}
