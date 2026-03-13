package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;
@Getter @Setter
public class CreateMovieRequest {
    @NotBlank String title;
    String description;
    @NotNull @Min(1) Integer durationMins;
    @NotBlank String genre;
    @NotBlank String language;
    @NotBlank String rating;
    @NotNull LocalDate releaseDate;
    String posterUrl;
}
