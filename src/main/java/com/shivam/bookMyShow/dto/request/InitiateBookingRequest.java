package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.List;
@Getter @Setter
public class InitiateBookingRequest {
    @NotNull Long showId;
    @NotEmpty List<Long> showSeatIds;
}
