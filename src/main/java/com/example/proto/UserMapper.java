package com.example.proto;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = UserMappingConfig.class)
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserData map(User user);

  User.Builder map(UserData userData);

}
