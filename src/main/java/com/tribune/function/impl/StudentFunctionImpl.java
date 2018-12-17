package com.tribune.function.impl;

import com.mysql.cj.util.StringUtils;
import com.tribune.core.Student;
import com.tribune.dao.StudentDao;
import com.tribune.function.IStudentFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by zhangmengdan
 * created at 2018/12/16 20:48
 **/
@Service
public class StudentFunctionImpl implements IStudentFunction {
    @Autowired
    StudentDao studentDao;

    @Override
    public Student login(String sName, String sPass) throws Exception {
        System.out.println(sName+sPass);
        if (StringUtils.isNullOrEmpty(sName)){
            System.out.println("用户名不能为空");
            return null;
        }
        if (StringUtils.isNullOrEmpty(sPass)){
            System.out.println("密码不能为空");
            return null;
        }
        Student student=studentDao.selectStudentBySname(sName);
        return student;
    }
}
