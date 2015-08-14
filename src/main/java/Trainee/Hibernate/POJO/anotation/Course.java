package Trainee.Hibernate.POJO.anotation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by phirayu on 20/7/2558.
 */
@Entity
@Table(name = "SET_COURSE")
public class Course {
    @Id
    @Column(name = "course_id")
    private String courseId;
    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "student_course", joinColumns = {
            @JoinColumn(name = "course_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "student_id",
                    nullable = false, updatable = false) })
    private Set<Student> students = new HashSet<Student>(0);

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

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
