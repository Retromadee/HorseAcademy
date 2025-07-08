package com.horsetrain.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="kids")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kid_id")
    private Long id;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String guardian_name;

    @Column(name="guardian_phone", nullable = false)
    private  String guardian_phone;

    @Column(nullable = false)
    private String guardian_email;

    public Child(){}

    private Child(String full_name,String age, String guardian_name, String guardian_phone, String guardian_email){
        this.full_name=full_name;
        this.age=age;
        this.guardian_name=guardian_name;
        this.guardian_phone=guardian_phone;
        this.guardian_email=guardian_email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getGuardian_phone() {
        return guardian_phone;
    }

    public void setGuardian_phone(String guardian_phone) {
        this.guardian_phone = guardian_phone;
    }

    public String getGuardian_email() {
        return guardian_email;
    }

    public void setGuardian_email(String guardian_email) {
        this.guardian_email = guardian_email;
    }
}
