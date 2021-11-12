package com.boctech.service;

import com.boctech.domain.Student;

import java.util.List;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/16- 14:41
 * Description:
 */
public interface StudentService {

    int addStudent(Student student);
    List<Student> findStudents();
}
