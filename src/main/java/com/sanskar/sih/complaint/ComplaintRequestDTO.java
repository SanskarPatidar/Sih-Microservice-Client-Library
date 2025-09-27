package com.sanskar.sih.complaint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintRequestDTO {
    private String title;
    private String description;
    private double locationLat;
    private double locationLon;
    private String city; // either from user input or reverse geocoding api
    private String state; // either from user input or reverse geocoding api
    private String country; // either from user input or reverse geocoding api
    private String type; // assigned by ai model
    private boolean isPublic;
    private List<String> imageUrls;
}
