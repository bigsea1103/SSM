package com.boctech.service.impl;

import com.boctech.dao.StudentDao;
import com.boctech.domain.Student;
import com.boctech.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/16- 14:42
 * Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    //引用类型自动注入@Autowired,@Resource
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudents();
    }
}
