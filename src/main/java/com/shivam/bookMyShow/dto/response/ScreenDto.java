package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.ScreenType;
import lombok.*;
@Getter @Setter
public class ScreenDto {
    private Long id;
    private String name;
    private ScreenType type;
    private Integer totalSeats;
}
