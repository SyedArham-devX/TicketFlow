package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.request.*;
import com.shivam.bookMyShow.dto.response.AuthResponse;
import com.shivam.bookMyShow.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/auth") @RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/signup") public ResponseEntity<AuthResponse> signup(@Valid @RequestBody SignupRequest req) { return ResponseEntity.ok(authService.signup(req)); }
    @PostMapping("/login") public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest req) { return ResponseEntity.ok(authService.login(req)); }
    @PostMapping("/refresh") public ResponseEntity<AuthResponse> refresh(@RequestHeader("Authorization") String token) { return ResponseEntity.ok(authService.refresh(token.substring(7))); }
}
