package com.kimu.mybatisexam.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimu.mybatisexam.DAO.UserDAO;
import com.kimu.mybatisexam.DTO.UserDTO;
import com.kimu.mybatisexam.DTO.UserParam;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	
	@Override
	public UserDTO loginCheck(UserParam param) {
		UserDTO user = userDao.loginCheck(param);
		System.out.println("service - " + user);
		return user;
	}

	
}
