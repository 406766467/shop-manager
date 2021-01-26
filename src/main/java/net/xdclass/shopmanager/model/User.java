package net.xdclass.shopmanager.model;



import lombok.*;

import java.util.Date;
import java.util.Objects;

@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private String address;
    private Date date;

    public static void main(String[] args) {
        User user = User.builder().address("中国").name("张三").build();
        System.out.println(user);
    }
}
