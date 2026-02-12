package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String fullName;
 private String email;
 public Long getId(){return id;}
 public String getFullName(){return fullName;}
 public void setFullName(String n){this.fullName=n;}
 public String getEmail(){return email;}
 public void setEmail(String e){this.email=e;}
}
