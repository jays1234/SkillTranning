package Hibernate.POJO.anotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by phirayu on 20/7/2558.
 */
@Entity
@Table(name = "SET_ROLE")
public class Role {
    @Id
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "name")
    private String name;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
