package com.example.nov17demo.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@Entity(name="department")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private Long id;

    @Column(name="department_name")
    private String dname;

    //@JsonManagedReference
    @OneToMany(mappedBy = "department",
    cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST})
    private List<Student> students;


}
