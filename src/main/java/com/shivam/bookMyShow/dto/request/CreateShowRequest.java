package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.*;
@Getter @Setter
public class CreateShowRequest {
    @NotNull Long movieId;
    @NotNull Long screenId;
    @NotNull LocalDate showDate;
    @NotNull LocalTime startTime;
    @NotBlank String language;
    @NotNull @DecimalMin("0.0") BigDecimal priceRegular;
    @NotNull @DecimalMin("0.0") BigDecimal pricePremium;
    @NotNull @DecimalMin("0.0") BigDecimal priceVip;
}
