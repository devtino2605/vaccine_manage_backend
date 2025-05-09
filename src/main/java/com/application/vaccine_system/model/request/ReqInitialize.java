package com.application.vaccine_system.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReqInitialize {
    @NotBlank
     String userId;
    @NotBlank
    String vaccineType;
    @NotNull
    private Long scheduleTime;
    @NotBlank   
    private String walletAddress;
}
