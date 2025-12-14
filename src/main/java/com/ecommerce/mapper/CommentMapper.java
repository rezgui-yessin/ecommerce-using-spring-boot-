package com.ecommerce.mapper;


import com.ecommerce.dto.CommentDto;
import com.ecommerce.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CommentMapper {

    @Mapping(target = "userId", source = "user.id")
    CommentDto commentToDto(Comment comment);
    @Mapping(target="user.id",source = "userId")
    Comment CommentToEntity(CommentDto commentDto);


}
