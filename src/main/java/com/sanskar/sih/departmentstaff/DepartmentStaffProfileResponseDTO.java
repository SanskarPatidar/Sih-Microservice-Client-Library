package com.sanskar.sih.departmentstaff;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentStaffProfileResponseDTO {
    private String id;
    private String departmentId; // reference to department
    private String fullName;

    private String profileImageUrl;
    private Long tasksCompleted;
    private Long tasksFailed;
    private Double workRating;

    public DepartmentStaffProfileResponseDTO(DepartmentStaffProfileView departmentStaffProfile) {
        this.id = departmentStaffProfile.getId();
        this.departmentId = departmentStaffProfile.getDepartmentId();
        this.fullName = departmentStaffProfile.getFullName();
        this.profileImageUrl = departmentStaffProfile.getProfileImageUrl();
        this.tasksCompleted = departmentStaffProfile.getTasksCompleted();
        this.tasksFailed = departmentStaffProfile.getTasksFailed();
        this.workRating = departmentStaffProfile.getWorkRating();
    }
}
