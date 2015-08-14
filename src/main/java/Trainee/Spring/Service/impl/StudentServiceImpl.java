package Spring.Service.impl;

import Hibernate.POJO.anotation.Student;
import Spring.Service.StudentService;
import Spring.dao.StudentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by phirayu on 23/7/2558.
 */
@Service
public class StudentServiceImpl implements StudentService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findStudent() {
        logger.info("in Student Service");
        return this.studentDao.findStudent();
    }
}
