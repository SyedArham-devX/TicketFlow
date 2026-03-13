package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.BookingStatus;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Getter @Setter
public class BookingDto {
    private Long id;
    private ShowDto show;
    private List<ShowSeatDto> showSeats;
    private BookingStatus status;
    private BigDecimal totalAmount;
    private LocalDateTime createdAt;
}
