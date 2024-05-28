package com.riwi.learningRiwi.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "message")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Lob
    @Column(nullable = false)
    private String content;

    @Builder.Default
    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "sender_id",
        referencedColumnName = "id"
    )
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "receiver_id",
        referencedColumnName = "id"
    )
    private User receiver;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
        name = "course_id", 
        referencedColumnName = "id")
    private Course course;

}
