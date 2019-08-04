package cn.spring.controller;

import cn.spring.bean.Student;
import cn.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class StudentSeverlet {
    @Autowired
    private StudentService studentService;

    public int deleteByPrimaryKey(Integer id) {
        return studentService.deleteByPrimaryKey(id);
    }

    public int insert(Student record) {
        return studentService.insert(record);
    }

    public int insertSelective(Student record) {
        return studentService.insertSelective(record);
    }

    public Student selectByPrimaryKey(Integer id) {
        return studentService.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Student record) {
        return studentService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Student record) {
        return studentService.updateByPrimaryKey(record);
    }
}
