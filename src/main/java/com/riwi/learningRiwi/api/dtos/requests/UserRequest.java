package com.riwi.learningRiwi.api.dtos.requests;

import com.riwi.learningRiwi.utils.enums.RoleUser;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank(message = "Username is required")
    private String username;
    
    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "E-mail is required")
    @Email
    private String email;
    
    @NotBlank(message = "First-name is required")
    private String name;
   
    @NotBlank(message = "Last-name is required")
    private String lastName;

    @NotNull(message = "Role is required")
    private RoleUser role;

}
