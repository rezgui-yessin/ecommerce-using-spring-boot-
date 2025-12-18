package com.ecommerce.mapper;


import com.ecommerce.dto.CartItemDto;
import com.ecommerce.dto.CommentDto;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CommentMapper {

    @Mapping(target = "userId",source = "user.id")
    CommentDto toDTO(Comment comment);
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product", ignore = true)
    Comment toEntity(CommentDto commentDTO);

}
