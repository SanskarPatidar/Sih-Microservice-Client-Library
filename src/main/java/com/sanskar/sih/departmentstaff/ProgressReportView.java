package com.sanskar.sih.departmentstaff;

import java.time.LocalDateTime;
import java.util.List;

public interface ProgressReportView {
    String getId();
    String getTaskId();        // reference to Task
    String getReportedById();  // reference to DepartmentStaffProfile
    LocalDateTime getReportedAt();

    String getReportTitle();
    String getReportDescription();
    List<String> getImageUrls();
}

