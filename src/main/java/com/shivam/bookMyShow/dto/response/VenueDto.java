package com.shivam.bookMyShow.dto.response;
import lombok.*;
import java.util.List;
@Getter @Setter
public class VenueDto {
    private Long id;
    private String name;
    private String address;
    private CityDto city;
    private List<String> amenities;
    private Boolean active;
}
