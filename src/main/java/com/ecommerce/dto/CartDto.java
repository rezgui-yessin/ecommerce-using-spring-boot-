package com.ecommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class CartDto {
    private Long id;
    private Long userId; //usedId
    private List<CartItemDto> items;
}