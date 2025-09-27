package com.sanskar.sih.issue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IssueSearchRequestDTO {
    private String id;
    private String assignedToId; // reference to AuthorityProfile based on type of complaints

    private String title;
    private String city;
    private String state;
    private String country;
    private String type;
    private String priority; // here aging will be applied
    private IssueStatus status;

    @Builder.Default
    private String order = "asc";
}
