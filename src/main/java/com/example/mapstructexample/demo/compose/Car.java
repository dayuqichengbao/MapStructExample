package com.example.mapstructexample.demo.compose;

import java.util.Date;

/**
 * @author 大鱼七成饱
 * @date 创建时间 2023/11/4 21:54
 */
public class Car {
    /**
     * 唯一id
     */
    private String id;

    private Date creationDate;
    /**
     * 车牌号
     */
    private String chepaihao;


    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", creationDate=" + creationDate +
                ", chepaihao='" + chepaihao + '\'' +
                '}';
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getChepaihao() {
        return chepaihao;
    }

    public void setChepaihao(String chepaihao) {
        this.chepaihao = chepaihao;
    }
}
