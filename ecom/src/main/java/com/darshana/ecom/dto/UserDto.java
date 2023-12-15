package com.darshana.ecom.dto;

import com.darshana.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String name;

    private UserRole userRole;
}
