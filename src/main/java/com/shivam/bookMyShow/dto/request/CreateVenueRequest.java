package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.List;
@Getter @Setter
public class CreateVenueRequest {
    @NotBlank String name;
    @NotBlank String address;
    @NotNull Long cityId;
    List<String> amenities;
}
