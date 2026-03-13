package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.SeatType;
import lombok.*;
@Getter @Setter
public class SeatDto {
    private Long id;
    private String rowNumber;
    private Integer seatNumber;
    private SeatType type;
}
