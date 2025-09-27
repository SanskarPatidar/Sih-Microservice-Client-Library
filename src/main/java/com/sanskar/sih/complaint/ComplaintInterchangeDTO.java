package com.sanskar.sih.complaint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintInterchangeDTO {
    private String id;
    private String citizenId; // reference to CitizenProfile
    private String issueId; // reference to Issue to which this complaint is linked
    private LocalDateTime createdAt;

    private String title;
    private String description;
    private double locationLat;
    private double locationLon;
    private String city; // either from user input or reverse geocoding api
    private String state; // either from user input or reverse geocoding api
    private String country; // either from user input or reverse geocoding api
    private String type; // assigned by ai model
    private String priority; // Scale of 1-10 decided by ai model
    private ComplaintStatus complaintStatus;
    private boolean isPublic;
    private List<String> imageUrls;

    public ComplaintInterchangeDTO(ComplaintView complaint) {
        this.id = complaint.getId();
        this.citizenId = complaint.getCitizenId();
        this.issueId = complaint.getIssueId();
        this.createdAt = complaint.getCreatedAt();
        this.title = complaint.getTitle();
        this.description = complaint.getDescription();
        this.locationLat = complaint.getLocationLat();
        this.locationLon = complaint.getLocationLon();
        this.city = complaint.getCity();
        this.state = complaint.getState();
        this.country = complaint.getCountry();
        this.type = complaint.getType();
        this.priority = complaint.getPriority();
        this.complaintStatus = complaint.getComplaintStatus();
        this.imageUrls = complaint.getImageUrls();
    }
}
