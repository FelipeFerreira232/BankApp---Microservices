package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class    AccountsDto {
    @Schema(
            description = "Account Number of Bank account", example = "3454433243"
    )
    @NotEmpty(message="Account number cannot be empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;


    @Schema(
            description = "Account type of Bank account", example = "Savings"
    )
    @NotEmpty(message="Account type cannot be empty")
    private String accountType;


    @Schema(
            description = "Branch address of Bank account", example = "1234, Main Street, New York"
    )
    @NotEmpty(message="Branch address cannot be empty")
    private String branchAddress;
}
