package com.shivam.bookMyShow.advice;
import lombok.*;
import org.springframework.http.HttpStatus;
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class ApiError {
    private HttpStatus status;
    private String message;
}
