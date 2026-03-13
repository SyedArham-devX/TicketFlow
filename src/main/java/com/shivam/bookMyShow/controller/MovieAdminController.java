package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.request.CreateMovieRequest;
import com.shivam.bookMyShow.dto.response.MovieDto;
import com.shivam.bookMyShow.service.MovieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/admin/movies") @RequiredArgsConstructor
public class MovieAdminController {
    private final MovieService movieService;
    @PostMapping public ResponseEntity<MovieDto> create(@Valid @RequestBody CreateMovieRequest req) { return ResponseEntity.status(HttpStatus.CREATED).body(movieService.createMovie(req)); }
    @PutMapping("/{id}") public ResponseEntity<MovieDto> update(@PathVariable Long id, @Valid @RequestBody CreateMovieRequest req) { return ResponseEntity.ok(movieService.updateMovie(id, req)); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) { movieService.deleteMovie(id); return ResponseEntity.noContent().build(); }
    @PatchMapping("/{id}/activate") public ResponseEntity<MovieDto> toggle(@PathVariable Long id) { return ResponseEntity.ok(movieService.toggleActive(id)); }
}
