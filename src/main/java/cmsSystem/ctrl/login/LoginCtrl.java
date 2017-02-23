package cmsSystem.ctrl.login;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cmsSystem.ctrl.common.BaseController;
import cmsSystem.service.login.LoginService;
import cmsSystem.service.login.impl.LoginServiceImpl;
import cmsSystem.utils.PageData;

@Controller
@RequestMapping("/login")
public class LoginCtrl extends BaseController{
	
	@Resource(name="LoginServiceImpl")
	private LoginService loginService;
	
	@RequestMapping("/select")  
	public ModelAndView select (){
		logger.info("LoginCtrl select");
		ModelAndView mv = new ModelAndView();
		try {
			List<PageData> list = this.loginService.select();
			System.out.println(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
}
