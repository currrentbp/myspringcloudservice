package com.currentbp.myspringcloudservice.controller;

import com.currentbp.myspringcloudapi.modul.Student;
import com.currentbp.myspringcloudservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author baopan
 * @createTime 2020/9/20 16:41
 */
@RestController
public class StudentServiceController {

    @Value("${server.port}")
    String port;

    @Autowired
    private StudentService studentService;


    @GetMapping("/getByName")
    public String getStudent(@RequestParam("name") String name) {
        System.out.println("===>StudentServiceController:get:name:" + name);
        return "Hi " + name + " ,I am from port:" + port;
    }

    @GetMapping("/getById")
    public Student getStudentById(@RequestParam("id") Integer id) {
        System.out.println("===>StudentServiceController:get:id:" + id);
        Student student= studentService.getById(id);
        return student;
    }

    @GetMapping("/getByIds")
    public List<Student> getStudents(@RequestParam("ids") List<Integer> ids) {
        System.out.println("===>StudentServiceController:get:ids:" + ids);
        List<Student> students = studentService.getByIds(ids);
        return students;
    }
}
