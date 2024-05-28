package com.riwi.learningRiwi.domain.entities;

import java.util.List;

import com.riwi.learningRiwi.utils.enums.RoleUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String lastName;

    @Enumerated
    @Column(nullable = false)
    private RoleUser role;

    @OneToMany(
        mappedBy = "student",
        fetch = FetchType.EAGER,
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Enrollment> enrollments;

    @OneToMany(
        mappedBy = "student",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Submission> submissions; 

    @OneToMany(
        mappedBy = "instructor",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Course> courses;

}
