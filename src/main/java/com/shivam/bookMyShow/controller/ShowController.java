package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.*;
import com.shivam.bookMyShow.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
@RestController @RequestMapping("/shows") @RequiredArgsConstructor
public class ShowController {
    private final ShowService showService;
    @GetMapping public ResponseEntity<Page<ShowDto>> search(
            @RequestParam(required=false) String city,
            @RequestParam(required=false) Long movieId,
            @RequestParam(required=false) @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(defaultValue="0") int page,
            @RequestParam(defaultValue="20") int size) {
        return ResponseEntity.ok(showService.searchShows(city, movieId, date, PageRequest.of(page, size)));
    }
    @GetMapping("/{id}") public ResponseEntity<ShowDto> getShow(@PathVariable Long id) { return ResponseEntity.ok(showService.getShowById(id)); }
    @GetMapping("/{id}/seats") public ResponseEntity<List<ShowSeatDto>> getSeatMap(@PathVariable Long id) { return ResponseEntity.ok(showService.getSeatMap(id)); }
}
