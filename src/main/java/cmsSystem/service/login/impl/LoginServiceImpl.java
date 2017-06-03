package cmsSystem.service.login.impl;

import java.util.List;

import cmsSystem.service.common.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import cmsSystem.service.login.LoginService;
import cmsSystem.utils.PageData;

@Service("LoginServiceImpl")
public class LoginServiceImpl extends BaseServiceImpl implements LoginService{

	public List<PageData> select() throws Exception {
		return (List<PageData>) this.findForList("loginMapper.select");
	}
	
	
}
