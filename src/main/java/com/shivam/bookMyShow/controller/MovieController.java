package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.MovieDto;
import com.shivam.bookMyShow.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/movies") @RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;
    @GetMapping public ResponseEntity<Page<MovieDto>> getMovies(
            @RequestParam(required=false) String city,
            @RequestParam(required=false) String genre,
            @RequestParam(defaultValue="0") int page,
            @RequestParam(defaultValue="20") int size) {
        return ResponseEntity.ok(movieService.getAllMovies(city, genre, PageRequest.of(page, size)));
    }
    @GetMapping("/{id}") public ResponseEntity<MovieDto> getMovie(@PathVariable Long id) { return ResponseEntity.ok(movieService.getMovieById(id)); }
}
