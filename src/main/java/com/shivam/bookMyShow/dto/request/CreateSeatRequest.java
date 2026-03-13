package com.shivam.bookMyShow.dto.request;
import com.shivam.bookMyShow.entity.enums.SeatType;
import jakarta.validation.constraints.*;
import lombok.*;
@Getter @Setter
public class CreateSeatRequest {
    @NotBlank String rowNumber;
    @NotNull Integer seatNumber;
    @NotNull SeatType type;
}
