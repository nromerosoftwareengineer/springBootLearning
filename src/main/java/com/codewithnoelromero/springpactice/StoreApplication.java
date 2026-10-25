package com.codewithnoelromero.springpactice;


import com.codewithnoelromero.springpactice.entities.Address;
import com.codewithnoelromero.springpactice.entities.Category;
import com.codewithnoelromero.springpactice.entities.Product;
import com.codewithnoelromero.springpactice.entities.Profile;
import com.codewithnoelromero.springpactice.entities.Tag;
import com.codewithnoelromero.springpactice.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.LinkedList;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
  //      ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
      var user = User.builder().name("John").password("pswd").email("noel.romero@gm.com").build();

        var profile = Profile.builder()
                        .bio("bio")
                                .build();
        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);

        var category = Category.builder()
                .id((byte) 1)
                .name("Electronics")
                .build();

        var laptop = Product.builder()
                .id(1L)
                .name("Laptop")
                .price(new BigDecimal("999.99"))
                .categoryId(category.getId())
                .build();

        var headphones = Product.builder()
                .id(2L)
                .name("Headphones")
                .price(new BigDecimal("49.50"))
                .categoryId(category.getId())
                .build();

        category.getProducts().add(laptop);
        category.getProducts().add(headphones);
        System.out.println(category);
        System.out.println(laptop);
        System.out.println(headphones);

    }

}
