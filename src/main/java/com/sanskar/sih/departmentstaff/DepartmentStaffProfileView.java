package com.sanskar.sih.departmentstaff;

public interface DepartmentStaffProfileView {
    String getId();
    String getUserId();        // reference to User
    String getDepartmentId();  // reference to Department
    String getFullName();

    String getProfileImageUrl();
    Long getTasksCompleted();
    Long getTasksFailed();
    Double getWorkRating();
}

