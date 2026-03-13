package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.VenueDto;
import com.shivam.bookMyShow.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/venues") @RequiredArgsConstructor
public class VenueController {
    private final VenueService venueService;
    @GetMapping public ResponseEntity<List<VenueDto>> getVenues(@RequestParam(required=false) String city) { return ResponseEntity.ok(venueService.getVenuesByCity(city != null ? city : "")); }
    @GetMapping("/{id}") public ResponseEntity<VenueDto> getVenue(@PathVariable Long id) { return ResponseEntity.ok(venueService.getVenueById(id)); }
}
