package com.kimu.mybatisexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kimu.mybatisexam.DTO.UserDTO;
import com.kimu.mybatisexam.DTO.UserParam;
import com.kimu.mybatisexam.Service.UserService;

@Controller
public class MemberController {

	@Autowired
	UserService userService;
	
	@GetMapping("/index")
	public String memeberLoginPage() {
		return "index";
	}
	
	@PostMapping("/login")
	public String memberLogin(UserParam param,Model model) {
		System.out.println("controller - "+ param);
		UserDTO user = userService.loginCheck(param);
		System.out.println("controller - "+user);
		
		//비밀번호는 맞춘상태
		if(user != null) {
			//아이디까지 맞는지 검사
			if(user.getMemberId().equals(param.getMemberId())) {
				//맞다면 회원정보 모델에 담고 index페이지로 이동
				model.addAttribute("loginMember", user);
				return "index";
			}else {
				//아닐시 msg를 담고 error페이지로 이동
				model.addAttribute("msg","아이디가 틀렸습니다");
				return "errorPage";
			}
		}
		//비밀번호가 틀렸을시 
		model.addAttribute("msg","비밀번호가 틀렸습니다");
		
		return "errorPage";
	}
	
}
