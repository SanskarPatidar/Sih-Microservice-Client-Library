package com.sanskar.sih.citizen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitizenProfileRequestDTO {
    private String fullName; // real world name can not be unique, thus not same as username of User
    private String address;
    private String profileImageUrl;
}
