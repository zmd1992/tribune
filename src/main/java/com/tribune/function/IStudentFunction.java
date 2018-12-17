package com.tribune.function;

import com.tribune.core.Student;
import org.springframework.stereotype.Service;

/**
 * 业务接口
 */
@Service
public interface IStudentFunction {
    Student login(String sName, String sPass) throws Exception;
}
