package com.example.mapstructexample.demo.expression;

import lombok.Data;

import java.util.Date;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:21
 */
@Data
public class CustomerDto {
    public Long id;
    public String customerName;

    private String format;
    private Date time;
}
