package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.NotificationStatus;
import com.shivam.bookMyShow.entity.enums.NotificationType;
import lombok.*;
import java.time.LocalDateTime;
@Getter @Setter
public class NotificationDto {
    private Long id;
    private NotificationType type;
    private String subject;
    private NotificationStatus status;
    private LocalDateTime createdAt;
}
