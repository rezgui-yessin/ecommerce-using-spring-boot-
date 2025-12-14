package com.ecommerce.mapper;

import com.ecommerce.dto.OrderDto;
import com.ecommerce.dto.OrderItemDto;
import com.ecommerce.model.Order;
import com.ecommerce.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

// Mapper for Order entity and Order DTO conversions
@Mapper(componentModel = "spring")
public interface OrderMapper {

    // Converts Order entity to OrderDto
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "orderItemDto", source = "item")
    OrderDto toDto(Order order);
    // Converts OrderDto to Order entity
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "item", source = "orderItemDto")
    Order toEntity(OrderDto orderDto);

     /*
     create list of dtos
     this list mapping method takes a list of Order entities
        and converts each entity to its corresponding OrderDto
        using the toDto method defined above.*
      */
    List<OrderDto> toDtos(List<Order> orders);
    /*
    create list of entities
    this list mapping method takes a list of OrderDto objects
    and converts each dto to its corresponding Order entity
    using the toEntity method defined above.*
     */
    List<Order> toEntitys(List<Order> orders);

    @Mapping(target = "productId", source = "product.id")
    OrderItemDto toOrderItemDTO(OrderItem orderItem);
    @Mapping(target = "product.id", source = "productId")
    OrderItem toOrderItemEntity(OrderItemDto orderItemDTO);

    List<OrderItemDto> toOrderItemDTOs(List<OrderItem> orderItem);
    List<OrderItem> toOrderItemEntities(List<OrderItemDto> orderItemDTO);


}
