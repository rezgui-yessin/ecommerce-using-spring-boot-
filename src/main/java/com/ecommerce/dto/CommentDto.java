package com.ecommerce.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
public class CommentDto {
    private Long id;
    // NotBlank validation to ensure content is not null or empty
    @NotBlank
    (message = "Content is required")
    private String content;

    @Min(value=1)
    @Max(value=5)
    private Integer score;
    private Long userId;
}
