package com.niu.dao;

import com.niu.model.Student;
import com.niu.model.SysUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: 数据库
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 6:55 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 6:55 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class DataBase {
    private static  final Random random = new Random();

    public static final List<Student> studentList=new ArrayList<>();
    public static final List<SysUser> adminList=new ArrayList<>();
    static {
        //初始化十个学生
        for (int i = 1000010; i < 1000019; i++) {
          Student student =   new Student(String.valueOf(i),"学生"+(1000019 -i),random.nextInt(100));
          studentList.add(student);
        }
        //初始化管理员用户
        adminList.add(new SysUser("admin","123"));
    }
}
