package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.request.*;
import com.shivam.bookMyShow.dto.response.*;
import com.shivam.bookMyShow.service.VenueService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/admin/venues") @RequiredArgsConstructor
public class VenueAdminController {
    private final VenueService venueService;
    @PostMapping public ResponseEntity<VenueDto> create(@Valid @RequestBody CreateVenueRequest req) { return ResponseEntity.status(HttpStatus.CREATED).body(venueService.createVenue(req)); }
    @PutMapping("/{id}") public ResponseEntity<VenueDto> update(@PathVariable Long id, @Valid @RequestBody CreateVenueRequest req) { return ResponseEntity.ok(venueService.updateVenue(id, req)); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) { venueService.deleteVenue(id); return ResponseEntity.noContent().build(); }
    @PostMapping("/{id}/screens") public ResponseEntity<ScreenDto> addScreen(@PathVariable Long id, @Valid @RequestBody CreateScreenRequest req) { return ResponseEntity.status(HttpStatus.CREATED).body(venueService.addScreen(id, req)); }
    @GetMapping("/{id}/screens") public ResponseEntity<List<ScreenDto>> getScreens(@PathVariable Long id) { return ResponseEntity.ok(venueService.getScreensByVenue(id)); }
}
