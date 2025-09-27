package com.sanskar.sih.departmentadmin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskCreateRequestDTO {
    private String assignedToId; // reference to DepartmentStaffProfile
    private String assignedIssueId; // reference to Issue

    private String title;
    private String description;
    private TaskStatus status;
    private List<String> imageUrls;
}
