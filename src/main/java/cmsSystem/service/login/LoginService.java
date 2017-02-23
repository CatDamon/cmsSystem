package cmsSystem.service.login;

import java.util.List;

import cmsSystem.utils.PageData;

public interface LoginService {
	
	//查询
	public List<PageData> select ()  throws Exception;
}
