package com.nju.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nju.data.dao.UserAddressDao;
import com.nju.data.dataobject.UserAddressDO;
import com.nju.service.UserAddressService;

public class UserAddressServiceImpl implements UserAddressService{
	@Autowired
	private UserAddressDao userAddressDao;
	
	
	@Override
	public void setDefaultAddress(String user, String street, String building,
			String room) {
		// TODO Auto-generated method stub
		userAddressDao.saveAddress(user, street, building, room, true);
	}

	@Override
	public UserAddressDO getDefaultAddress(String user_id) {
		// TODO Auto-generated method stub
		return userAddressDao.getDefaultAddress(user_id);
	}

}
