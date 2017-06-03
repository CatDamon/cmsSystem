package cmsSystem.service.systemManage.impl;

import cmsSystem.service.common.impl.BaseServiceImpl;
import cmsSystem.service.systemManage.UserManageService;
import cmsSystem.state.AvailableState;
import cmsSystem.utils.Page;
import cmsSystem.utils.PageData;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * Created by Administrator on 2017/5/7.
 */
@Service("UserManageServiceImpl")
public class UserManageServiceImpl extends BaseServiceImpl implements UserManageService{


    public List<PageData> selectUserList(Page page) throws Exception {
        List<PageData> userList = (List<PageData>) this.daoSupport.findForList("UserManageMapper.selectUserlistPage",page);
        for (PageData userData:userList) {
            userData.put("available", AvailableState.codeToDesc(userData.get("available").toString()));
        }
        return userList;
    }
}
