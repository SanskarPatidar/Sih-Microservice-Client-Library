package com.sanskar.sih.issue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponseDTO {
    private String id;
    private String issueId; // reference to Issue
    private String citizenId; // reference to User (could be citizen or department staff)
    private String content;
    private LocalDateTime timestamp;

    public CommentResponseDTO(CommentView comment) {
        this.id = comment.getId();
        this.issueId = comment.getIssueId();
        this.citizenId = comment.getCitizenId();
        this.content = comment.getContent();
        this.timestamp = comment.getTimestamp();
    }
}
