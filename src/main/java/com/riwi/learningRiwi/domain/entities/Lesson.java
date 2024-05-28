package com.riwi.learningRiwi.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "lesson")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String title;

    @Lob
    private String content;

    @OneToMany(
        fetch = FetchType.LAZY,
        mappedBy = "lesson",
        cascade = CascadeType.ALL, 
        orphanRemoval = true)
    private List<Activity> activities;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
        name = "course_id", 
        referencedColumnName = "id")
    private Course course;
}
