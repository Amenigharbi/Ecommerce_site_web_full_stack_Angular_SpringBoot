package com.codeWithProjects.Ecomm.dto;

import com.codeWithProjects.Ecomm.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}
