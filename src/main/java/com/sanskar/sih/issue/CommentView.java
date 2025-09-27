package com.sanskar.sih.issue;

import java.time.LocalDateTime;

public interface CommentView {
    String getId();
    String getIssueId();   // reference to Issue
    String getCitizenId();    // reference to User
    String getContent();
    LocalDateTime getTimestamp();
}
