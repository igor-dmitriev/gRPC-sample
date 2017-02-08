package com.example.proto;

import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;

/**
 * Created by Igor Dmitriev on 2/8/17
 */
@MapperConfig(
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
    uses = MessageFactory.class
)
public class UserMappingConfig {
}
