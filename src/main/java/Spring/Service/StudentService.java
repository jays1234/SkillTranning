package Spring.Service;

import Hibernate.POJO.anotation.Student;

import java.util.List;

/**
 * Created by phirayu on 23/7/2558.
 */
public interface StudentService {
    abstract List<Student> findStudent();
}
