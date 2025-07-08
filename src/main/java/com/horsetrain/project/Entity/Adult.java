package com.horsetrain.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="adults")
public class Adult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="adult_id")
    private Long id;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    private String email;

    @Column(name = "phone" ,nullable = false)
    private String phone;

    @Column(nullable = false)
    private String age;


    public Adult() {}

    public Adult(String full_name, String email, String phone, String age) {
        this.full_name = full_name;
        this.email=email;
        this.phone=phone;
        this.age=age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
