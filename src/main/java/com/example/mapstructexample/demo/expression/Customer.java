package com.example.mapstructexample.demo.expression;

import lombok.Data;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:20
 */
@Data
public class Customer {
    private String id;
    private String name;

    private TimeAndFormat timeAndFormat;
}
