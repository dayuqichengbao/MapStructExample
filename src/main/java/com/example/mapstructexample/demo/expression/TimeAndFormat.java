package com.example.mapstructexample.demo.expression;

import lombok.Data;

import java.util.Date;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/5 00:09
 */
@Data
public class TimeAndFormat {
    private Date time;
    private String format;

    public TimeAndFormat(Date time, String format) {
        this.time = time;
        this.format = format;
    }
}
