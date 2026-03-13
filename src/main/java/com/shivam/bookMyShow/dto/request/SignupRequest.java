package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
@Getter @Setter
public class SignupRequest {
    @NotBlank String name;
    @Email @NotBlank String email;
    @NotBlank @Size(min=6) String password;
}
