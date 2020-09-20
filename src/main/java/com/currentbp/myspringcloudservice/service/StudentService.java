package com.currentbp.myspringcloudservice.service;

import com.currentbp.myspringcloudapi.modul.Student;

import java.util.List;

public interface StudentService {

    Student getById(Integer id);
    List<Student> getByIds(List<Integer> ids);
}
