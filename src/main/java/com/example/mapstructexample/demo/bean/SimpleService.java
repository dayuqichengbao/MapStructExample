package com.example.mapstructexample.demo.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 23:12
 */
@Component
public class SimpleService {

    public String formatName(String name) {
        return  "您的名字是：" + name;
    }

}
