package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.request.InitiateBookingRequest;
import com.shivam.bookMyShow.dto.response.BookingDto;
import com.shivam.bookMyShow.entity.enums.BookingStatus;
import com.shivam.bookMyShow.service.BookingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/bookings") @RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;
    @PostMapping("/initiate") public ResponseEntity<BookingDto> initiate(@Valid @RequestBody InitiateBookingRequest req) { return ResponseEntity.status(HttpStatus.CREATED).body(bookingService.initiateBooking(req)); }
    @PostMapping("/{id}/payment") public ResponseEntity<String> payment(@PathVariable Long id) { return ResponseEntity.ok(bookingService.initiatePayment(id)); }
    @GetMapping("/{id}/status") public ResponseEntity<BookingStatus> status(@PathVariable Long id) { return ResponseEntity.ok(bookingService.getBookingStatus(id)); }
    @PostMapping("/{id}/cancel") public ResponseEntity<Void> cancel(@PathVariable Long id) { bookingService.cancelBooking(id); return ResponseEntity.noContent().build(); }
    @GetMapping("/my") public ResponseEntity<List<BookingDto>> myBookings() { return ResponseEntity.ok(bookingService.getMyBookings()); }
    @GetMapping("/{id}") public ResponseEntity<BookingDto> getBooking(@PathVariable Long id) { return ResponseEntity.ok(bookingService.getBookingById(id)); }
}
