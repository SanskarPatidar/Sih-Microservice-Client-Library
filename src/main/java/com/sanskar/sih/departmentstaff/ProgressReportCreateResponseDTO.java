package com.sanskar.sih.departmentstaff;

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
public class ProgressReportCreateResponseDTO {
    private String id;
    private String taskId; // reference to Task
    private String reportedById; // reference to DepartmentStaffProfile
    private LocalDateTime reportedAt;

    private String reportTitle;
    private String reportDescription;
    private List<String> imageUrls;

    public ProgressReportCreateResponseDTO(ProgressReportView report) {
        this.id = report.getId();
        this.taskId = report.getTaskId();
        this.reportedById = report.getReportedById();
        this.reportedAt = report.getReportedAt();
        this.reportTitle = report.getReportTitle();
        this.reportDescription = report.getReportDescription();
        this.imageUrls = report.getImageUrls();
    }
}
