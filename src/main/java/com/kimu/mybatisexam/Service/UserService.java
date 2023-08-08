package com.kimu.mybatisexam.Service;

import com.kimu.mybatisexam.DTO.UserDTO;
import com.kimu.mybatisexam.DTO.UserParam;

public interface UserService {

	public UserDTO loginCheck(UserParam param);
	
}
