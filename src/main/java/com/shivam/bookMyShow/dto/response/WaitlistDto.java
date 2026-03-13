package com.shivam.bookMyShow.dto.response;
import com.shivam.bookMyShow.entity.enums.WaitlistStatus;
import lombok.*;
@Getter @Setter
public class WaitlistDto {
    private Long id;
    private Integer position;
    private WaitlistStatus status;
}
