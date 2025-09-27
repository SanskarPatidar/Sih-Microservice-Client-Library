package com.sanskar.sih.issue;

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
public class ResolvementResponseDTO {
    private String id;
    private String issueId; // reference to Issue
    private String resolvedById; // reference to DepartmentProfile
    private LocalDateTime resolvedAt;

    private String title;
    private String description;
    private List<String> imageUrls;

    public ResolvementResponseDTO(ResolvementReportView report) {
        this.id = report.getId();
        this.issueId = report.getIssueId();
        this.resolvedById = report.getResolvedById();
        this.resolvedAt = report.getResolvedAt();
        this.title = report.getTitle();
        this.description = report.getDescription();
        this.imageUrls = report.getImageUrls();
    }

}
