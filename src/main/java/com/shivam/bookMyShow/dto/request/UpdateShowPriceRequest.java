package com.shivam.bookMyShow.dto.request;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter
public class UpdateShowPriceRequest {
    @NotNull @DecimalMin("0.0") BigDecimal priceRegular;
    @NotNull @DecimalMin("0.0") BigDecimal pricePremium;
    @NotNull @DecimalMin("0.0") BigDecimal priceVip;
}
