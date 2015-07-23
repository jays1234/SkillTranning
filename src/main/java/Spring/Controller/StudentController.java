package Spring.Controller;

import Hibernate.POJO.anotation.Student;
import Spring.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by phirayu on 23/7/2558.
 */
@Controller
public class StudentController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/student.html", method = RequestMethod.GET)
    private ModelAndView getStudent(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
        logger.info("in Student.html");
        List<Student> studentList = studentService.findStudent();
        Map model = new HashMap();
        model.put("studentList",studentList);

        return new ModelAndView("student",model);
    }
}
