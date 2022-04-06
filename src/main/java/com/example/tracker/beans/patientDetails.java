package com.example.tracker.beans;
import com.example.tracker.utils.SexEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import javax.persistence.*;
import java.util.List;

@Entity
@Table()
public class patientDetails {
    @Id
    private String patient_id;
    private String name;
    private Integer age;
    private String sex;
    private boolean accept=false;

    public patientDetails(String patient_id, String name, Integer age, String sex,boolean accept) {
        this.patient_id = patient_id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.accept=accept;
    }

    public boolean getAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    public patientDetails() {
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "patientDetails{" +
                "patient_id='" + patient_id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", accept=" + accept +
                '}';
    }
}
