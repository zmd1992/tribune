package com.tribune.dao;

import com.tribune.core.Student;
import org.apache.ibatis.annotations.Param;

/**
 * created by zhangmengdan
 * created at 2018/12/16 20:38
 **/
public interface StudentDao {
Student selectStudentBySname(@Param("sName")String sName)throws Exception;
}
