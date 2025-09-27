package com.sanskar.sih.issue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResolvementRequestDTO {
    private String issueId;

    private String title;
    private String description;
    private List<String> imageUrls;
}
