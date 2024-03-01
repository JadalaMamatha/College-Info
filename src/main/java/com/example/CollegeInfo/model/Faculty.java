package com.example.CollegeInfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String email;
    public String gender;
    public String contact;
    public String qualification;
    public String position;
    public String description;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}