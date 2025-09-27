package com.sanskar.sih.citizen;

import com.sanskar.sih.complaint.ComplaintStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitizenProfileInterchangeDTO {
    private String id;
    private String userId; // reference to User
    private String fullName; // real world name can not be unique, thus not same as username of User
    private String address;

    private String profileImageUrl;
    private Long totalComplaints;
    private Long totalFeedbacks;
    private Long totalComments;
    private Double communityScore;

    public CitizenProfileInterchangeDTO(CitizenProfileView citizenProfile) {
        this.id = citizenProfile.getId();
        this.userId = citizenProfile.getUserId();
        this.fullName = citizenProfile.getFullName();
        this.address = citizenProfile.getAddress();
        this.profileImageUrl = citizenProfile.getProfileImageUrl();
        this.totalComplaints = citizenProfile.getTotalComplaints();
        this.totalFeedbacks = citizenProfile.getTotalFeedbacks();
        this.totalComments = citizenProfile.getTotalComments();
        this.communityScore = citizenProfile.getCommunityScore();
    }


}
