package com.sanskar.sih.citizen;

public interface CitizenProfileView {
    String getId();
    String getUserId();
    String getFullName();
    String getAddress();
    String getProfileImageUrl();
    Long getTotalComplaints();
    Long getTotalFeedbacks();
    Long getTotalComments();
    Double getCommunityScore();
}
