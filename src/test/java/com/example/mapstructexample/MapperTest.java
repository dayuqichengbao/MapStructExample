package com.example.mapstructexample;

import com.example.mapstructexample.demo.bean.StudentDto;
import com.example.mapstructexample.demo.bean.StudentMapper;
import com.example.mapstructexample.demo.builder.PersonDto;
import com.example.mapstructexample.demo.builder.PersonMapper;
import com.example.mapstructexample.demo.compose.BikeDto;
import com.example.mapstructexample.demo.compose.CarDto;
import com.example.mapstructexample.demo.compose.TransportationMapper;
import com.example.mapstructexample.demo.constant.Source;
import com.example.mapstructexample.demo.constant.SourceTargetMapper;
import com.example.mapstructexample.demo.constant.Target;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:54
 */
@SpringBootTest
public class MapperTest {


    @Resource
    private TransportationMapper transportationMapper;

    @Test
    public void testCompose() {
        CarDto carDto = new CarDto();
        carDto.setId("1");
        carDto.setPlateNo("京C11111");

        BikeDto bikeDto = new BikeDto();
        bikeDto.setId("2");
        bikeDto.setBrand("飞鸽");


        System.out.println("car:" + transportationMapper.map(carDto));
        System.out.println("bike:" + transportationMapper.map(bikeDto));
    }


    @Resource
    private PersonMapper personMapper;
    @Test
    public void testBuilder() {
        PersonDto personDto = new PersonDto();
        personDto.setName("zhangsan");
        System.out.println(personMapper.map(personDto));
    }

    @Resource
    public StudentMapper studentMapper;
    @Test
    public void testInjection() {
        StudentDto studentDto = new StudentDto();
        studentDto.setName("lisi");
        StudentDto map = studentMapper.map(studentDto);
        System.out.println(map);
    }

    @Resource
    public SourceTargetMapper sourceTargetMapper;
    @Test
    public void testConstant() {
        Source source = new Source();
        Target target = sourceTargetMapper.sourceToTarget(source);
        System.out.println(target);
    }

}
