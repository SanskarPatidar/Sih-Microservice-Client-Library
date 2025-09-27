package com.sanskar.sih.departmentstaff;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProgressReportCreateRequestDTO {
    private String taskId;

    private String reportTitle;
    private String reportDescription;
    private List<String> imageUrls;
}
