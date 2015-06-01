package com.nju.service;

import com.nju.data.dataobject.UserAddressDO;

public interface UserAddressService {
	public void setDefaultAddress(String user,String street,String building,String room);
	public UserAddressDO getDefaultAddress(String user_id);
}
