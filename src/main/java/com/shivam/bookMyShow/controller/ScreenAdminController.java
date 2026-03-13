package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.request.*;
import com.shivam.bookMyShow.dto.response.*;
import com.shivam.bookMyShow.service.VenueService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/admin/screens") @RequiredArgsConstructor
public class ScreenAdminController {
    private final VenueService venueService;
    @PutMapping("/{id}") public ResponseEntity<ScreenDto> update(@PathVariable Long id, @Valid @RequestBody CreateScreenRequest req) { return ResponseEntity.ok(venueService.updateScreen(id, req)); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) { venueService.deleteScreen(id); return ResponseEntity.noContent().build(); }
    @PostMapping("/{id}/seats") public ResponseEntity<List<SeatDto>> addSeats(@PathVariable Long id, @Valid @RequestBody List<CreateSeatRequest> req) { return ResponseEntity.status(HttpStatus.CREATED).body(venueService.addSeats(id, req)); }
    @GetMapping("/{id}/seats") public ResponseEntity<List<SeatDto>> getSeats(@PathVariable Long id) { return ResponseEntity.ok(venueService.getSeatsByScreen(id)); }
}
