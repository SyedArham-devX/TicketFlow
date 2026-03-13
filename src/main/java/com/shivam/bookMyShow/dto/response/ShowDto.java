package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.ShowStatus;
import lombok.*;
import java.math.BigDecimal;
import java.time.*;
@Getter @Setter
public class ShowDto implements java.io.Serializable{
    private Long id;
    private MovieDto movie;
    private ScreenDto screen;
    private LocalDate showDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String language;
    private BigDecimal priceRegular;
    private BigDecimal pricePremium;
    private BigDecimal priceVip;
    private ShowStatus status;
    private Long availableSeats;
}
