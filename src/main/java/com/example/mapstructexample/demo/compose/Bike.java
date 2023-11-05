package com.example.mapstructexample.demo.compose;

import java.util.Date;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 21:54
 */
public class Bike {
    /**
     * 唯一id
     */
    private String id;

    private Date creationDate;

    /**
     * 品牌
     */
    private String brandName;

    public Bike() {
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id='" + id + '\'' +
                ", creationDate=" + creationDate +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
