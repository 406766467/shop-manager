package net.xdclass.shopmanager;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.xdclass.shopmanager.mapper")
public class ShopManagerApplication {

    public static void main(String[] args) {
        System.out.println("begin");
        SpringApplication.run(ShopManagerApplication.class, args);
    }

}
