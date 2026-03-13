package com.shivam.bookMyShow.dto.response;
import lombok.*;
import java.time.LocalDate;
@Getter @Setter
public class MovieDto implements java.io.Serializable {
    private Long id;
    private String title;
    private String description;
    private Integer durationMins;
    private String genre;
    private String language;
    private String rating;
    private LocalDate releaseDate;
    private String posterUrl;
    private Boolean active;
}
