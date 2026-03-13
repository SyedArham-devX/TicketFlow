package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
@Getter @Setter
public class LoginRequest {
    @Email @NotBlank String email;
    @NotBlank String password;
}
