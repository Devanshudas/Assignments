package com.hexaware.policymanagement.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.policymanagement.entities.PolicyPayment;

public class PolicyPaymentServicesImp implements IPolicyPaymetServices {

	@Override
	public boolean createPolicyPayment(PolicyPayment policypayment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePolicyPayment(PolicyPayment policypayment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePolicyPayment(PolicyPayment policypayment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PolicyPayment getPolicyPaymentById(int txnid) {
		PolicyPayment pp1 = new PolicyPayment(1, 1, 1, 1, 1, "a", "a", 1);
		return pp1;
	}

	@Override
	public List<PolicyPayment> getAllPolicyPayment() 
	{
		List<PolicyPayment> getAllPolicyPayment = new ArrayList<>();
		getAllPolicyPayment.add(new PolicyPayment(1,1,1,1,1,"a","a",1));
		getAllPolicyPayment.add(new PolicyPayment(2,2,1,1,1,"a","a",1));
		
		return getAllPolicyPayment;

		
	}

}
