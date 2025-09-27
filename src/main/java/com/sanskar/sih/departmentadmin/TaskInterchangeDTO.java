package com.sanskar.sih.departmentadmin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskInterchangeDTO {
    private String id;
    private String assignedFromId; // reference to DepartmentAdminProfile
    private String assignedToId; // reference to DepartmentStaffProfile
    private String assignedIssueId; // reference to Issue
    private LocalDateTime issuedAt;
    private String completedAt;

    private String title;
    private String description;
    private TaskStatus status;
    private List<String> imageUrls;

    public TaskInterchangeDTO(TaskView task) {
        this.id = task.getId();
        this.assignedFromId = task.getAssignedFromId();
        this.assignedToId = task.getAssignedToId();
        this.assignedIssueId = task.getAssignedIssueId();
        this.issuedAt = task.getIssuedAt();
        this.completedAt = task.getCompletedAt();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.status = task.getStatus();
        this.imageUrls = task.getImageUrls();
    }
}
