package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.*;
import com.shivam.bookMyShow.service.AnalyticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
@RestController @RequestMapping("/admin/analytics") @RequiredArgsConstructor
public class AnalyticsController {
    private final AnalyticsService analyticsService;
    @GetMapping("/revenue") public ResponseEntity<AnalyticsDto> revenue(
            @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate start,
            @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate end) {
        return ResponseEntity.ok(analyticsService.getRevenueReport(start, end));
    }
    @GetMapping("/shows/{id}") public ResponseEntity<ShowReportDto> showReport(@PathVariable Long id) { return ResponseEntity.ok(analyticsService.getShowReport(id)); }
    @GetMapping("/movies/top") public ResponseEntity<List<MovieDto>> topMovies(
            @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate start,
            @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate end,
            @RequestParam(defaultValue="10") int limit) {
        return ResponseEntity.ok(analyticsService.getTopMovies(start, end, limit));
    }
    @GetMapping("/venues/{id}") public ResponseEntity<AnalyticsDto> venueReport(@PathVariable Long id) { return ResponseEntity.ok(analyticsService.getVenueReport(id)); }
    @GetMapping("/peak-hours") public ResponseEntity<List<Object[]>> peakHours() { return ResponseEntity.ok(analyticsService.getPeakBookingHours()); }
}
