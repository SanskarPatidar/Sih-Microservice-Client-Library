package com.sanskar.sih.departmentadmin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentAdminProfileResponseDTO {
    private String id;
    private String departmentName;
    private String city;
    private String state;
    private String country;

    private String bio;
    private String profileImageUrl;

    private Long issuesAssigned;
    private Long issuesResolved;
    private Double averageResolutionTime; // in hours
    private Double performanceRating;
    private LocalDateTime tenureStartDate;

    public DepartmentAdminProfileResponseDTO(DepartmentAdminProfileView departmentAdminProfile) {
        this.id = departmentAdminProfile.getId();
        this.departmentName = departmentAdminProfile.getDepartmentName();
        this.city = departmentAdminProfile.getCity();
        this.state = departmentAdminProfile.getState();
        this.country = departmentAdminProfile.getCountry();
        this.bio = departmentAdminProfile.getBio();
        this.profileImageUrl = departmentAdminProfile.getProfileImageUrl();
        this.issuesAssigned = departmentAdminProfile.getIssuesAssigned();
        this.issuesResolved = departmentAdminProfile.getIssuesResolved();
        this.averageResolutionTime = departmentAdminProfile.getAverageResolutionTime();
        this.performanceRating = departmentAdminProfile.getPerformanceRating();
        this.tenureStartDate = departmentAdminProfile.getTenureStartDate();
    }
}
