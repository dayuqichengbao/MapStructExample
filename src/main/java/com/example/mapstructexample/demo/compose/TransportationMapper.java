package com.example.mapstructexample.demo.compose;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 21:59
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TransportationMapper {


    @ToEntity
    @Mapping( target = "brandName", source = "brand")
    Bike map(BikeDto source);

    @ToEntity
    @Mapping( target = "chepaihao", source = "plateNo")
    Car map(CarDto source);
}
