package com.nju.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nju.data.dataobject.UserAddressDO;
import com.nju.service.UserAddressService;
import com.nju.util.ResponseBuilder;

@Controller
public class UserAddressGetController {
	@Autowired
	private UserAddressService userAddressService;
	
	@RequestMapping(value = "/GetMyAddr",method = RequestMethod.POST)
	public void fetchDefaultAddress(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		ResponseBuilder rb = new ResponseBuilder();
		
		String username = request.getParameter("USER_ID");
		
		UserAddressDO user_addr = userAddressService.getDefaultAddress(username);
		System.out.println("Get Default Address!!!");
		try {
			rb.writeJsonResponse(response, user_addr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
	}
}
