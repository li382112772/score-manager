package com.niu.model;

/**
 * @description: 学生
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 6:51 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 6:51 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class Student {
    private String stuNo; //学号
    private String name;  //姓名
    private Integer score; //分数

    public Student() {
    }

    public Student(String stuNo, String name, Integer score) {
        this.stuNo = stuNo;
        this.name = name;
        this.score = score;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
