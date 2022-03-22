package com.niu.service;

import com.niu.model.Student;
import com.niu.model.SysUser;

import java.util.*;

/**
 * @description:
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 6:54 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 6:54 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class MenuService {
    private Scanner scan = new Scanner(System.in);

    private static final List<String> menu = new ArrayList<>();
    private StudentService studentService = new StudentService();
    private LoginService loginService = new LoginService();
    static {
        //初始化菜单
        menu.add("显示成绩信息");
        menu.add("添加成绩信息");
        menu.add("修改成绩信息");
        menu.add("删除成绩信息");
        menu.add("查询成绩信息");
        menu.add("退出");
    }

    /**
     * 选择菜单
     * @author nxq
     * @param id:
     * @return void
     */
    public boolean choice(String id){
        switch (id){
            case "1":
                studentService.showAll();
                break;
            case "2":
                add();
                break;
            case "3":
                modify();
                break;
            case "4":
                delete();
                break;
            case "5":
                find();
                break;
            case "6":
                System.out.println("退出！");
                return false;
            default:
                System.out.println("输入的菜单有误");
        }
        return true;
    }

    /**
     * 展示菜单
     * @author nxq
     * @param :
     * @return void
     */
    public void showMenu(){
        System.out.println("*************菜单*************");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(1+i+"."+menu.get(i));
        }
        System.out.println("------------------------------");
    }
    /**
     * 登陆
     * @author nxq
     * @param :
     * @return void
     */
    public boolean login(){
        System.out.print("请输入用户名:");
        String userName = scan.next();
        System.out.print("请输入密码:");
        String password = scan.next();
        SysUser result =  loginService.login(userName,password);
        if (null == result){
            System.out.println("登陆失败，帐号密码有误，请重新登陆");
        }else {
            System.out.println("登陆成功");
        }
        return null != result;


    }
    /**
     * 添加
     * @author nxq
     * @param :
     * @return void
     */
    public void add(){
        System.out.println("请输入学号");
        String stuNo = scan.next();
        System.out.println("请输入姓名");
        String name = scan.next();
        System.out.println("请输入成绩");
        Integer score = scan.nextInt();
        studentService.add(new Student(stuNo,name,score));
        System.out.println("添加成功");

    }
    /**
     * 修改
     * @author nxq
     * @param :
     * @return void
     */
    public boolean modify(){
        System.out.println("请输入学号");
        String stuNo = scan.next();
        Student student = studentService.findByStuNo(stuNo);
        if (null == student){
            System.out.println("该学生不存在");
            return false;
        }
        showStudent(student);
        System.out.println("请输入新成绩");
        Integer score = scan.nextInt();
        studentService.modifyScore(stuNo,score);
        System.out.println("修改成功");
        return true;

    }
    /**
     * 删除
     * @author nxq
     * @param :
     * @return void
     */
    public void delete(){
        System.out.println("请输入学号");
        String stuNo = scan.next();
        Student student = studentService.findByStuNo(stuNo);
        if (null == student){
        }
        showStudent(student);
        studentService.remove(stuNo);
        System.out.println("删除成功");
    }
    /**
     * 查找
     * @author nxq
     * @param :
     * @return void
     */
    public void find(){
        System.out.println("请输入学号");
        String stuNo = scan.next();
        Student student = studentService.findByStuNo(stuNo);
        if (null == student){
            System.out.println("该学生不存在");
        }
        showStudent(student);

    }

    private void showStudent(Student student){
        System.out.print("学生信息：");
        System.out.println(student.getStuNo()+"\t"+student.getName()+"\t"+student.getScore());

    }
}
