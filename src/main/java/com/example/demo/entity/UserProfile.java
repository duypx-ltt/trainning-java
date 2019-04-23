package com.example.demo.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tbl_user_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private int phone;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private String sex;

    @Column(name = "cmt")
    private int cmt;

    @Column(name = "create_at")
    private Date create_at;

    @Column(name = "update_at")
    private Date update_at;

    @Column(name = "delete_at")
    private Date delete_at;

    public UserProfile() {
    }

    public UserProfile(String name, int phone, int age, String sex, int cmt, Date create_at, Date update_at, Date delete_at) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
        this.cmt = cmt;
        this.create_at = create_at;
        this.update_at = update_at;
        this.delete_at = delete_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCmt() {
        return cmt;
    }

    public void setCmt(int cmt) {
        this.cmt = cmt;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Date getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(Date delete_at) {
        this.delete_at = delete_at;
    }
}
