package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.UserDto;
import com.shivam.bookMyShow.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.shivam.bookMyShow.util.AppUtils.getCurrentUser;
@RestController @RequestMapping("/users") @RequiredArgsConstructor
public class UserController {
    private final ModelMapper modelMapper;
    @GetMapping("/profile") public ResponseEntity<UserDto> getProfile() { return ResponseEntity.ok(modelMapper.map(getCurrentUser(), UserDto.class)); }
}
