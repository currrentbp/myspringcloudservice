package com.currentbp.myspringcloudservice.service.impl;


import com.currentbp.common.model.Student;
import com.currentbp.myspringcloudservice.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baopan
 * @createTime 2020/9/20 17:23
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getById(Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("name_"+id);
        return student;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) {
        Student student = new Student();
        student.setId(ids.get(0));
        student.setName("name_"+ids.get(0));
        List<Student> students = new ArrayList<>();
        students.add(student);
        return students;
    }
}
