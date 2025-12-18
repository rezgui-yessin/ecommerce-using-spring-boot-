package com.ecommerce.mapper;

import com.ecommerce.dto.CommentDto;
import com.ecommerce.dto.ProductDto;
import com.ecommerce.model.Comment;
import com.ecommerce.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface    ProductMapper {

    @Mapping(target = "userId",source = "user.id")
    CommentDto toDTO(Comment comment);
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product", ignore = true)
    Comment toEntity(CommentDto commentDTO);
}
