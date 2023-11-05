package com.example.mapstructexample.demo.builder;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:49
 */

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonMapper {

    Person map(PersonDto dto);
}
