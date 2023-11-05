package com.example.mapstructexample.demo.compose;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 22:00
 */
public class BikeDto {
    /**
     * 唯一id
     */
    private String id;
    /**
     * 创建日期
     */
    private String createDate;

    /**
     * 品牌
     */
    private String brand;

    public BikeDto(String id, String createDate, String brand) {
        this.id = id;
        this.createDate = createDate;
        this.brand = brand;
    }

    public BikeDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
