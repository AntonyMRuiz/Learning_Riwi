package com.riwi.learningRiwi.api.dtos.responses;

import java.util.List;

import com.riwi.learningRiwi.domain.entities.Course;
import com.riwi.learningRiwi.domain.entities.Enrollment;
import com.riwi.learningRiwi.domain.entities.Submission;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserFullResponse extends UserBaseResponse {
    private List<Enrollment> enrollments;
    private List<Submission> submissions;
    private List<Course> courses;
}
