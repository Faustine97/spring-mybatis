package cn.spring.service.impl;

import cn.spring.bean.Student;
import cn.spring.dao.StudentDao;
import cn.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int deleteByPrimaryKey(Integer id) {
        return studentDao.deleteByPrimaryKey(id);
    }

    public int insert(Student record) {
        return studentDao.insert(record);
    }

    public int insertSelective(Student record) {
        return studentDao.insertSelective(record);
    }

    public Student selectByPrimaryKey(Integer id) {
        return studentDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Student record) {
        return studentDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Student record) {
        return studentDao.updateByPrimaryKey(record);
    }
}

