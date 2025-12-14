package com.ecommerce.dto;


import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CartItemDto {
    private Long id;
    private Long productId;
    @Positive(message=" Quantity must be positive value")
    private Integer quantity;
}
