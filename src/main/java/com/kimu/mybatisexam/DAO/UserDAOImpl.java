package com.kimu.mybatisexam.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimu.mybatisexam.DTO.UserDTO;
import com.kimu.mybatisexam.DTO.UserParam;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public UserDTO loginCheck(UserParam param) {
		UserDTO user = sqlSession.selectOne("UserDAO.loginCheck",param);
		System.out.println("DAO - " + user);
		return user;
	}

}
