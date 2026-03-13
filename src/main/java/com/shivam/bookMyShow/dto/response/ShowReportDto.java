package com.shivam.bookMyShow.dto.response;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class ShowReportDto {
    private Long showId;
    private String movieTitle;
    private Long totalSeats;
    private Long bookedSeats;
    private Long availableSeats;
    private Double occupancyPercent;
    private BigDecimal totalRevenue;
}
