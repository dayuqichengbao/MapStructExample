package com.example.mapstructexample.demo.expression;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.UUID;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:22
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, imports = UUID.class)
public interface CustomerMapper {

    @Mapping(target = "timeAndFormat",
            expression = "java( new TimeAndFormat( s.getTime(), s.getFormat() ) )")
    @Mapping(target = "id", source = "id", defaultExpression = "java( UUID.randomUUID().toString() )")
    Customer toCustomer(CustomerDto s);

}
