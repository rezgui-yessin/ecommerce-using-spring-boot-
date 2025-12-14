package com.ecommerce.mapper;

import com.ecommerce.dto.CartDto;
import com.ecommerce.dto.CartItemDto;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CartMapper {
    /**
     * CartMapper is responsible for mapping between
     * Cart entities and CartDto objects.
     *
     * This mapper helps to:
     * - Convert database entities to DTOs for API responses
     * - Convert DTOs to entities for persistence
     * - Avoid exposing full User and Product objects
     * - Improve code readability and maintainability
     */


    @Mapping( target = "userId", source = "user.Id" )
    CartDto toDto(Cart cart);
    @Mapping(target = "user.Id", source = "userId" )
    Cart toEntity(CartDto cartDto);
    @Mapping (target = "productId", source = "product.Id" )
    CartItemDto toDto(CartItem cartItem);
    @Mapping (target = "product.Id", source = "productId" )
    CartItem toEntity(CartItemDto cartItemDto);



}
