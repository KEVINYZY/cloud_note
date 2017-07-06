package org.bianqi.note.sso.controller;
 
import org.bianqi.common.utils.NoteResult;
import org.bianqi.note.pojo.User;
import org.bianqi.note.sso.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * 注册
 * @author Administrator
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class RegitsterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/page/register")
	public String showRegister(){
		return "register";
	}
	
	@RequestMapping("user/check/{param}/{type}")
	@ResponseBody
	public NoteResult checkData(
			@PathVariable String param,
			@PathVariable Integer type){
		NoteResult noteResult = registerService.checkData(param, type);
		return noteResult;
	}
	
	@RequestMapping(value="/user/register",
			method=RequestMethod.POST)
	@ResponseBody
	public NoteResult register(User user){
		NoteResult noteResult = registerService.register(user);
		return noteResult;
	}
	
}
