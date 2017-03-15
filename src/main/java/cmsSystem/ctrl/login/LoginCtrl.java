package cmsSystem.ctrl.login;

import java.util.List;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cmsSystem.ctrl.common.BaseController;
import cmsSystem.service.login.LoginService;
import cmsSystem.utils.PageData;

@Controller
public class LoginCtrl extends BaseController{
	
	@Resource(name="LoginServiceImpl")
	private LoginService loginService;
	
	@RequestMapping(value = "/select", method=RequestMethod.GET)  
	public ModelAndView select (){
		logger.info("LoginCtrl select");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index.html");
		try {
			List<PageData> list = this.loginService.select();
			System.out.println(list);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return mv;
	}
	//登录
	@RequestMapping(value="/login")
	public ModelAndView login (){
		logger.info("LoginCtrl login...");
		ModelAndView mv = new ModelAndView("/login.html");
		
		System.out.println(this.getRequest().getPathInfo());
		return mv;
	}
}
