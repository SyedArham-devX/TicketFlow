package com.shivam.bookMyShow.dto.response;
import lombok.*;
import java.math.BigDecimal;
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class AnalyticsDto {
    private BigDecimal totalRevenue;
    private Long totalBookings;
    private BigDecimal avgRevenuePerBooking;
}
