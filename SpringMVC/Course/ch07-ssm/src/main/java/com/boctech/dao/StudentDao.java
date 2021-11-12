package com.boctech.dao;

import com.boctech.domain.Student;

import java.util.List;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/16- 14:32
 * Description:
 */
public interface StudentDao {

    int insertStudent(Student student);
    List<Student> selectStudents();
}
