package Trainee.model;

import java.io.Serializable;

/**
 * Created by phirayu on 7/17/15.
 */
public class DataWriteFile implements Serializable {
    String name = "";
    String lastname = "";
    public DataWriteFile(String name, String lastname){
        this.name=name;
        this.lastname=lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
