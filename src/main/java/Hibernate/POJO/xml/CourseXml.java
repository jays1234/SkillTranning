package Hibernate.POJO.xml;

import java.io.Serializable;

/**
 * Created by phirayu on 19/7/2558.
 */
public class CourseXml implements Serializable {
    String courseId;
    String name;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
