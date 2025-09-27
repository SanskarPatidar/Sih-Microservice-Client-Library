package com.sanskar.sih.issue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IssueSearchResponseDTO {
    private String id;
    private String assignedToId; // reference to AuthorityProfile based on type of complaints
    private LocalDateTime issuedAt;

    private String title;
    private String description;
    private String imageUrl;

    private double locationLat;
    private double locationLon;
    private String city;
    private String state;
    private String country;
    private String type;
    private String priority; // here aging will be applied
    private IssueStatus status;
    private Long likes;

    public IssueSearchResponseDTO(IssueView issue) {
        this.id = issue.getId();
        this.issuedAt = issue.getIssuedAt();
        this.assignedToId = issue.getAssignedToId();
        this.title = issue.getTitle();
        this.description = issue.getDescription();
        this.imageUrl = issue.getImageUrl();
        this.locationLat = issue.getLocation().getLat();
        this.locationLon = issue.getLocation().getLat();
        this.city = issue.getCity();
        this.state = issue.getState();
        this.country = issue.getCountry();
        this.type = issue.getType();
        this.priority = issue.getPriority();
        this.status = issue.getStatus();
        this.likes = issue.getLikes();
    }
}
