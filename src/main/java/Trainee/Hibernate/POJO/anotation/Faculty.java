package Trainee.Hibernate.POJO.anotation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by phirayu on 20/7/2558.
 */
@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @Column(name = "faculty_id")
    private String facultyId;
    @Column(name = "name")
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "faculty")
    private Set<Student> studentSet = new HashSet<Student>();

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
