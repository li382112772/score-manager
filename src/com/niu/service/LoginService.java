package com.niu.service;

import com.niu.dao.DataBase;
import com.niu.model.SysUser;

/**
 * @description: 登陆相关
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 7:01 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 7:01 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class LoginService {
    /**
     * 登陆方法
     * @author nxq
     * @param username:
     * @param password:
     * @return com.niu.model.SysUser
     */
    public SysUser login(String username,String password){

        for (SysUser user : DataBase.adminList)
            if (user.getUsername().equals(username)
            &&user.getPassword().equals(password))
                return user;

        return null;
    }
}
