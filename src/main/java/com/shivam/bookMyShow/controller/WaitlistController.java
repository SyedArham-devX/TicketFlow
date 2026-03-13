package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.WaitlistDto;
import com.shivam.bookMyShow.service.WaitlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/waitlist") @RequiredArgsConstructor
public class WaitlistController {
    private final WaitlistService waitlistService;
    @PostMapping("/{showId}") public ResponseEntity<WaitlistDto> join(@PathVariable Long showId) { return ResponseEntity.status(HttpStatus.CREATED).body(waitlistService.joinWaitlist(showId)); }
    @DeleteMapping("/{showId}") public ResponseEntity<Void> leave(@PathVariable Long showId) { waitlistService.leaveWaitlist(showId); return ResponseEntity.noContent().build(); }
    @GetMapping("/{showId}/position") public ResponseEntity<WaitlistDto> position(@PathVariable Long showId) { return ResponseEntity.ok(waitlistService.getMyPosition(showId)); }
    @GetMapping("/admin/{showId}") public ResponseEntity<List<WaitlistDto>> adminView(@PathVariable Long showId) { return ResponseEntity.ok(waitlistService.getWaitlistForShow(showId)); }
}
