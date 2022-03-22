package com.niu;

import com.niu.service.MenuService;

import java.util.Scanner;

/**
 * @description: 主类
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 6:54 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 6:54 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        MenuService  menu =   new MenuService();

        boolean loginFlag ;
        System.out.println("请先登陆");
        //先登陆
        do {
            loginFlag = menu.login();
        }while (!loginFlag);


        //再进行操作
        boolean menuFlag;
        do {
            menu.showMenu();
            System.out.println("请选择菜单");
            menuFlag = menu.choice(scan.next());

        }while (menuFlag);
    }
}
