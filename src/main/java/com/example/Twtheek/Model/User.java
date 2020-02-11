package com.example.Twtheek.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.*;
import java.util.Date;

@Entity
@Table(name = "Users")
public class User {
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "national_Id")
    private int national_Id;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "password")
    private String passwordField;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;




    public void User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNational_Id() {
        return national_Id;
    }

    public void setNational_Id(int national_Id) {
        this.national_Id = national_Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
