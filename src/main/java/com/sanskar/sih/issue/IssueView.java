package com.sanskar.sih.issue;

import java.time.LocalDateTime;

public interface IssueView {
    String getId();
    String getAssignedToId();   // reference to AuthorityProfile
    LocalDateTime getIssuedAt();

    String getTitle();
    String getDescription();
    String getImageUrl();

    Point getLocation();       // << portable type, no Mongo dependency
    String getCity();
    String getState();
    String getCountry();
    String getType();
    String getPriority();
    IssueStatus getStatus();
    Long getLikes();
}
