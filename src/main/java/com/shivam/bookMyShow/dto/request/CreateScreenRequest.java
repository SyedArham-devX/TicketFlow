package com.shivam.bookMyShow.dto.request;
import com.shivam.bookMyShow.entity.enums.ScreenType;
import jakarta.validation.constraints.*;
import lombok.*;
@Getter @Setter
public class CreateScreenRequest {
    @NotBlank String name;
    @NotNull ScreenType type;
}
