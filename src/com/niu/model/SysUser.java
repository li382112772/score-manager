package com.niu.model;

/**
 * @description: 系统用户
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 6:51 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 6:51 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class SysUser {
    private String username;
    private String password;

    public SysUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SysUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
