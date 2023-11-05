package com.example.mapstructexample.demo.compose;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:01
 */
public class CarDto {
    /**
     * 唯一id
     */
    private String id;
    /**
     * 车牌号
     */
    private String plateNo;

    public CarDto() {
    }


    @Override
    public String toString() {
        return "CarDto{" +
                "id='" + id + '\'' +
                ", plateNo='" + plateNo + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}
