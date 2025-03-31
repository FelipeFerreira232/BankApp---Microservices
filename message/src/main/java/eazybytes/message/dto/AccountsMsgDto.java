package eazybytes.message.dto;

/**
 * Data Transfer Object for Accounts
 */
public record AccountsMsgDto(
        Long accountNumber,
        String name,
        String email,
        String mobileNumber
) { }
