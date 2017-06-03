package cmsSystem.ctrl.system.userManage;

import javax.annotation.Resource;

import cmsSystem.ctrl.common.BaseController;
import cmsSystem.service.systemManage.UserManageService;
import cmsSystem.utils.Page;
import cmsSystem.utils.PageData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/system/userManage")
public class UserManageCtrl extends BaseController {

	@Resource(name = "UserManageServiceImpl")
	private UserManageService userManageService;


	@RequestMapping("/toUserManage")
	public ModelAndView toUserManage (Page page) throws Exception {
		logger.info("UserManageCtrl toUserManage...");
		ModelAndView mv = new ModelAndView("/system/userManage/userIndex.html");

		List<PageData> userList = this.userManageService.selectUserList(page);
		mv.addObject("userList" ,userList);
		return mv;
	}
}
