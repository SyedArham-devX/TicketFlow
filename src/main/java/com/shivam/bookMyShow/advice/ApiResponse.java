package com.shivam.bookMyShow.advice;
import lombok.*;
@Getter @Setter @NoArgsConstructor
public class ApiResponse<T> {
    private T data;
    private ApiError error;
    public ApiResponse(T data) { this.data = data; }
    public ApiResponse(ApiError error) { this.error = error; }
}
