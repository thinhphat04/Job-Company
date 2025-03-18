package com.thinhphat.companyms.company;


import jakarta.persistence.*;

import java.util.List;
@Entity
public class Company {
//    @Value("${spring.datasource.url}")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Description;




    public Company() {
    }
    public Company(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        Description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }




}
