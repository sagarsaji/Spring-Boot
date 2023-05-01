package com.example.Students.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Institution {

    @Id
    @GeneratedValue
    private int id;
    private String institutename;
    private String institutelocation;
    @ElementCollection
    private List<String> offeredcourse;

    @OneToMany(mappedBy = "institution", cascade = CascadeType.ALL)
    private Set<Student> students;

}
