package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name="Error Response",
        description = "Schema to hold error response information")
@AllArgsConstructor
@Data
public class ErrorResponseDto {

    @Schema(description="API Path where the error occurred", example = "/cards")
    private String apiPath;

    @Schema(description="HTTP Status Code", example = "404")
    private HttpStatus errorCode;

    @Schema(description="Error Message", example = "Card not found")
    private String errorMessage;

    @Schema(description="Error Time", example = "2021-07-01T10:00:00")
    private LocalDateTime errorTime;
}
