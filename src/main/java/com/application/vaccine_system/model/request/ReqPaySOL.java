package com.application.vaccine_system.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.MODULE)
public class ReqPaySOL {
    @NotBlank
    Long amount;
    @NotBlank
    String walletAddress;
    @NotBlank
    String userTokenAccount;
    @NotBlank
    String systemTokenAccount;
}
