package com.shivam.bookMyShow.controller;
import com.shivam.bookMyShow.dto.response.NotificationDto;
import com.shivam.bookMyShow.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/users/notifications") @RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;
    @GetMapping public ResponseEntity<List<NotificationDto>> getAll() { return ResponseEntity.ok(notificationService.getMyNotifications()); }
}
