package com.ecommerce.mapper;

import com.ecommerce.dto.CommentDto;
import com.ecommerce.dto.ProductDto;
import com.ecommerce.model.Comment;
import com.ecommerce.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    // Entity -> DTO
    @Mapping(target = "comments", source = "comments")
    ProductDto toDto(Product product);

    // DTO -> Entity
    @Mapping(target = "comments", source = "comments")
    Product toEntity(ProductDto productDto);

}
