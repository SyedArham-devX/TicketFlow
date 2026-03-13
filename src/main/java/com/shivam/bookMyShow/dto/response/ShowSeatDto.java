package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.SeatStatus;
import com.shivam.bookMyShow.entity.enums.SeatType;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter
public class ShowSeatDto {
    private Long id;
    private String rowNumber;
    private Integer seatNumber;
    private SeatType seatType;
    private SeatStatus status;
    private BigDecimal price;
}
