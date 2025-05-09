package com.application.vaccine_system.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ReqSchedule {
    @NotBlank
    String userId;
    @NotBlank
    String vaccineType;
    @NotBlank
    Long scheduleTime;
    @NotBlank
    String walletAddress;
}
