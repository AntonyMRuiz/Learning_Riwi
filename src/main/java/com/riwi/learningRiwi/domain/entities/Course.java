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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "course")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(
        mappedBy = "course",
        fetch = FetchType.LAZY,
        orphanRemoval = false,
        cascade = CascadeType.ALL
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Enrollment> enrollments;

    @OneToMany(
        mappedBy = "course",
        fetch = FetchType.LAZY,
        orphanRemoval = false,
        cascade = CascadeType.ALL
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Lesson> lessons;

    @OneToMany(
        mappedBy = "course",
        fetch = FetchType.LAZY,
        orphanRemoval = false,
        cascade = CascadeType.ALL
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Message> messages;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "instructor_id",
        referencedColumnName = "id"
    )
    private UserEntity instructor;
}
