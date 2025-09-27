package com.sanskar.sih.issue;

import java.time.LocalDateTime;
import java.util.List;

public interface ResolvementReportView {
    String getId();
    String getIssueId();       // reference to Issue
    String getResolvedById();  // reference to DepartmentProfile
    LocalDateTime getResolvedAt();

    String getTitle();
    String getDescription();
    List<String> getImageUrls();
}
