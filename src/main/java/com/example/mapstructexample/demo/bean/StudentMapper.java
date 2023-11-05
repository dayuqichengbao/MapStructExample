package com.example.mapstructexample.demo.bean;

import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:49
 */

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class StudentMapper {

    @Autowired
    protected SimpleService simpleService;

    @Mapping(target = "name", expression = "java(simpleService.formatName(source.getName()))")
    public abstract StudentDto map(StudentDto source);
}
