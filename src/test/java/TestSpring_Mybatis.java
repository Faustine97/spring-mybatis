import cn.spring.bean.Student;
import cn.spring.controller.StudentSeverlet;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring_Mybatis {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionTemplate sqlsession = ac.getBean("sqlSession", SqlSessionTemplate.class);
        List<Student> list = sqlsession.selectList("getStudentList");
        System.out.println(list);

    }
}

