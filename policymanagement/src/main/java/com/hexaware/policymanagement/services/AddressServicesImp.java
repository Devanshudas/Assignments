package com.hexaware.policymanagement.services;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.policymanagement.entities.Address;
import com.hexaware.policymanagement.entities.Policy;

public class AddressServicesImp implements IAddressServices {

	@Override
	public boolean createAddress(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAddress(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Address getAddressById(int address_id) {
		Address a1  = new Address(1,"a","b","c",1);
		return a1;
	}

	@Override
	public List<Address> getAllAddress() 
	{
		List<Address> getAllAddress = new ArrayList<>();
		getAllAddress.add(new Address(1,"a","b","c",1));
		getAllAddress.add(new Address(2,"a","b","c",2));
		return getAllAddress;
	}

}
