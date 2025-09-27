package com.sanskar.sih.departmentadmin;

import java.time.LocalDateTime;

public interface DepartmentAdminProfileView {
    String getId();
    String getUserId();        // reference to User
    String getDepartmentName();
    String getCity();
    String getState();
    String getCountry();

    String getBio();
    String getProfileImageUrl();

    Long getIssuesAssigned();
    Long getIssuesResolved();
    Double getAverageResolutionTime(); // in hours
    Double getPerformanceRating();
    LocalDateTime getTenureStartDate();
}
