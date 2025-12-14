package com.ecommerce.dto;


import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long id;
    private Long productId;
    @Positive(message=" Quantity must be positive value")
    private Integer quantity;
    @Positive(message =" Price mut be positive " )
    private BigDecimal price;
}
