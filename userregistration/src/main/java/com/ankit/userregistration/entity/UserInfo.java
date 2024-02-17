package com.ankit.userregistration.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "user")
@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String emailId;
    private String address;
}
