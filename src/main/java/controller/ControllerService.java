package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;

@Controller
public class ControllerService {
	@Resource(name="service")
	private ServiceHandler service;
	@RequestMapping("/toLogin.do")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("login.do")
	public String login(HttpServletRequest request) {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		User user = service.login(uname, pwd);
		if(user!=null) {
			return "success";
		}
		request.setAttribute("fail_login", "用户名或密码错误！");
		return "login";
	}
}

