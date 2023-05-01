package com.example.Students.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String studentId;
    private String name;
    private String email;
    private String phno;
    private String qualification;
    private int experience;
    @ElementCollection
    private List<String> courses;
    private String address;
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "institution_id",referencedColumnName = "id")
    private Institution institution;

}
