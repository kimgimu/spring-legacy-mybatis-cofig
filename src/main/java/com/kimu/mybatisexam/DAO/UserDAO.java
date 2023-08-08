package com.kimu.mybatisexam.DAO;

import com.kimu.mybatisexam.DTO.UserDTO;
import com.kimu.mybatisexam.DTO.UserParam;

public interface UserDAO {

	public UserDTO loginCheck(UserParam param);
	
}
