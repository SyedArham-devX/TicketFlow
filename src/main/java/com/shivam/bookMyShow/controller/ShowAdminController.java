package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.request.*;
import com.shivam.bookMyShow.dto.response.ShowDto;
import com.shivam.bookMyShow.service.ShowService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/admin/shows") @RequiredArgsConstructor
public class ShowAdminController {
    private final ShowService showService;
    @PostMapping public ResponseEntity<ShowDto> create(@Valid @RequestBody CreateShowRequest req) { return ResponseEntity.status(HttpStatus.CREATED).body(showService.createShow(req)); }
    @PutMapping("/{id}") public ResponseEntity<ShowDto> update(@PathVariable Long id, @Valid @RequestBody CreateShowRequest req) { return ResponseEntity.ok(showService.updateShow(id, req)); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) { showService.deleteShow(id); return ResponseEntity.noContent().build(); }
    @PatchMapping("/{id}/prices") public ResponseEntity<ShowDto> updatePrices(@PathVariable Long id, @Valid @RequestBody UpdateShowPriceRequest req) { return ResponseEntity.ok(showService.updatePrices(id, req)); }
}
