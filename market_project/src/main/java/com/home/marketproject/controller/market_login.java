package com.home.marketproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import myspring.model.MemberBean;


@Controller
public class market_login {
	
	@RequestMapping(value = "market_login.do")
	public String market_login() {
		System.out.println("값왔따잉");
		
		return "market_memberLogin";
	
	}
	
	/* 로그인 인증 */
	@RequestMapping(value = "/market_login_ok.do", method = RequestMethod.POST)
	public String market_login_ok(@RequestParam("id") String id, 
			                      @RequestParam("pwd") String pwd,
			                      HttpSession session, 
			                      Model model) throws Exception {
		
		System.out.println("로그인 인증 확인됐다잉 ");
/*		int result=0;		
		MemberBean m = memberService.userCheck(id);

		if (m == null) {	// 등록되지 않은 회원일때
			
			result = 1;
			model.addAttribute("result", result);
			
			return "member/loginResult";
			
		} else {			// 등록된 회원일때
			if (m.getJoin_pwd().equals(pwd)) {// 비번이 같을때
				session.setAttribute("id", id);

				String join_name = m.getJoin_name();
				String join_profile = m.getJoin_profile();

				model.addAttribute("join_name", join_name);
				model.addAttribute("join_profile", join_profile);

				return "member/main";
				
			} else {// 비번이 다를때
				result = 2;
				model.addAttribute("result", result);
				*/
				return "market_loginResult";				
			}
	@RequestMapping(value = "/market_login_tomain.do", method = RequestMethod.POST)
	public String market_login_tomain() {
		System.out.println("로그인 성공 값 넘어와따잉");
		return "/main";
	}
	
	
	
		}	
	





