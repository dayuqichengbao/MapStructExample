package com.example.mapstructexample.demo.constant;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 23:58
 */
@Data
public class Target {
    private String stringProperty;

    private long longProperty;

    private String stringConstant;

    private Integer integerConstant;

    private Long  longWrapperConstant;

    private Date dateConstant;

    private OrderTypeEnum orderTypeEnum;
}
