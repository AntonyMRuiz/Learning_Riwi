package com.riwi.learningRiwi.api.dtos.responses;

import com.riwi.learningRiwi.utils.enums.RoleUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserBaseResponse {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private RoleUser role;
}
