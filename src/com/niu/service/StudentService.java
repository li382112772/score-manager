package com.niu.service;

import com.niu.dao.DataBase;
import com.niu.model.Student;

/**
 * @description: 学生相关
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 7:07 下午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 7:07 下午
 * @updateRemark:
 * @version: 1.0
 **/
public class StudentService {

    public void add(Student student){
        DataBase.studentList.add(student);
    }
    public void showAll(){
        System.out.println("学号\t姓名\t分数");
        for (Student student : DataBase.studentList) {
            System.out.println(student.getStuNo()+"\t"+student.getName()+"\t"+student.getScore());
        }
    }
    /**
     * 修改分数
     * @author nxq
     * @param stuNo:
     * @param score:
     * @return void
     */
    public void modifyScore(String stuNo,Integer score){
        for (Student db : DataBase.studentList) {
            if (db.getStuNo().equals(stuNo)){
                db.setScore(score);
                return;
            }
        }

    }
    /**
     * 根据学号查询学生
     * @author nxq
     * @param stuNo:
     * @return com.niu.model.Student
     */
    public Student findByStuNo(String stuNo){
        for (Student student :DataBase.studentList){
            if (student.getStuNo().equals(stuNo)){
                return student;
            }
        }
        System.out.println("学生不存在");

      return   null;
    }
    /**
     * 删除学生信息
     * @author nxq
     * @param stuNo:
     * @return boolean
     */
    public boolean remove(String stuNo){
        Student stuRemove = null;
        for (Student student : DataBase.studentList) {
            if (student.getStuNo().equals(stuNo)){
                stuRemove = student;
                break;
            }
        }
        if (stuRemove==null){
            System.out.println("该学生不存在");
            return false;
        }
        DataBase.studentList.remove(stuRemove);
        return true;

    }


}
