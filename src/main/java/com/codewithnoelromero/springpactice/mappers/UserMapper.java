package com.codewithnoelromero.springpactice.mappers;

import com.codewithnoelromero.springpactice.dtos.UserDTO;
import com.codewithnoelromero.springpactice.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(User user);
}
