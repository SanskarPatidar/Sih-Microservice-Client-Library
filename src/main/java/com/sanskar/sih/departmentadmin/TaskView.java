package com.sanskar.sih.departmentadmin;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskView {
    String getId();
    String getAssignedFromId();   // reference to DepartmentAdminProfile
    String getAssignedToId();     // reference to DepartmentStaffProfile
    String getAssignedIssueId();  // reference to Issue
    LocalDateTime getIssuedAt();
    String getCompletedAt();

    String getTitle();
    String getDescription();
    TaskStatus getStatus();
    List<String> getImageUrls();
}

