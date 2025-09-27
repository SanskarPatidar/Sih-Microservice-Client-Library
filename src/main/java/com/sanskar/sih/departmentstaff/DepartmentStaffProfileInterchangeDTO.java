package com.sanskar.sih.departmentstaff;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentStaffProfileInterchangeDTO {
    private String id;
    private String userId;
    private String departmentId; // reference to department
    private String fullName;

    private String profileImageUrl;
    private Long tasksCompleted;
    private Long tasksFailed;
    private Double workRating;

    public DepartmentStaffProfileInterchangeDTO(DepartmentStaffProfileView departmentStaffProfile) {
        this.id = departmentStaffProfile.getId();
        this.userId = departmentStaffProfile.getUserId();
        this.departmentId = departmentStaffProfile.getDepartmentId();
        this.fullName = departmentStaffProfile.getFullName();
        this.profileImageUrl = departmentStaffProfile.getProfileImageUrl();
        this.tasksCompleted = departmentStaffProfile.getTasksCompleted();
        this.tasksFailed = departmentStaffProfile.getTasksFailed();
        this.workRating = departmentStaffProfile.getWorkRating();
    }
}
