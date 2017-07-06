package org.bianqi.note.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bianqi.common.utils.CookieUtils;
import org.bianqi.common.utils.NoteResult;
import org.bianqi.note.sso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 * 登录
 * @author BQ
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@Value("${TOKEN_KEY}")
	private String TOKEN_KEY;
	
	@RequestMapping("/page/login")
	public String showLogin(String redirect,Model model){
		model.addAttribute("redirect", redirect);
		return "login";
	}
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public String login(String username,String password,
			HttpServletRequest request,HttpServletResponse response){
		NoteResult noteResult = loginService.userLogin(username, password);
		if(noteResult.getStatus() == 200){
			String token = noteResult.getData().toString();
			CookieUtils.setCookie(request, response, TOKEN_KEY, token);;
		}
		if(noteResult.getStatus() == 200){
			return "redirect:http://localhost:8088/note/loginnow";
		}
		   return "redirect:http://www.baidu.com";
	}
	
	
	
}
