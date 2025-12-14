package com.ecommerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    @NotBlank(message=" Product name is required")
    private String name;
    @NotBlank(message=" Product Desscription is required")
    private String description;
    @Positive(message=" Price must be positive value")
    private BigDecimal price;
    @Positive(message=" Quantity must be positive value")
    private String quantity;
    private List<CommentDto> comments;

}
