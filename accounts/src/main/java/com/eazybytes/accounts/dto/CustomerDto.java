package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account information"
)
public class CustomerDto {

    @Schema(
            description="Name of the customer", example="John Doe"
    )
    @NotEmpty(message="Name cannot be empty")
    @Size(min=2, max=30, message="Name length between 2  and 30 characters")
    private String name;


    @Schema(
            description="Email of the customer", example="johndoe@gmail.com"
    )
    @NotEmpty(message="Email cannot be empty")
    @Email(message="Email should be valid")
    private String email;


    @Schema(
            description="Mobile number of the customer", example="12345678901"
    )
    @NotEmpty(message="Mobile number cannot be empty")
    @Pattern(regexp="(^$|[0-9]{11})", message="Mobile number should be 11 digits")
    private String mobileNumber;


    @Schema(
            description="Account details of the customer"
    )
    private AccountsDto accountsDto;
}
