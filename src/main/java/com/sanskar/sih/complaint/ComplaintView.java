package com.sanskar.sih.complaint;

import java.time.LocalDateTime;
import java.util.List;

public interface ComplaintView {
    String getId();
    String getCitizenId(); // reference to CitizenProfile
    String getIssueId();   // reference to Issue
    LocalDateTime getCreatedAt();

    String getTitle();
    String getDescription();
    double getLocationLat();
    double getLocationLon();
    String getCity();
    String getState();
    String getCountry();
    String getType();      // assigned by AI model
    String getPriority();  // Scale of 1–10 decided by AI model
    ComplaintStatus getComplaintStatus();
    boolean isPublic();
    List<String> getImageUrls();
}
