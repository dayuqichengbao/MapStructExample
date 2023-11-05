package com.example.mapstructexample.demo.compose;

import org.mapstruct.Mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.CLASS)
//自动生成当前日期
@Mapping(target = "creationDate", expression = "java(new java.util.Date())")
//忽略id
@Mapping(target = "id", ignore = true)
public @interface ToEntity { }
