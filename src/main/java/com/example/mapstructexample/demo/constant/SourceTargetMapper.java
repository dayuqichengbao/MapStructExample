package com.example.mapstructexample.demo.constant;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/5 00:00
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SourceTargetMapper {


    @Mapping(target = "stringProperty", source = "stringProp", defaultValue = "undefined")
    @Mapping(target = "longProperty", source = "longProp", defaultValue = "-1l")
    @Mapping(target = "stringConstant", constant = "Constant Value")
    @Mapping(target = "integerConstant", constant = "14")
    @Mapping(target = "longWrapperConstant", constant = "3001L")
    @Mapping(target = "dateConstant", dateFormat = "yyyy-MM-dd", constant = "2023-09-01-")
    Target sourceToTarget(Source s);
}
