package com.boctech.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/30- 11:03
 * Description:
 *
 */
@Data
@Component  //只有在容器中的组件，才会有springboot提供的强大功能
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;

//    public String getBrand() {
//        return brand;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "brand='" + brand + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
