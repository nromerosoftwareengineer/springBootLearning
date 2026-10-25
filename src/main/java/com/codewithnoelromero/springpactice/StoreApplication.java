package com.codewithnoelromero.springpactice;


import com.codewithnoelromero.springpactice.entities.Address;
import com.codewithnoelromero.springpactice.entities.Profile;
import com.codewithnoelromero.springpactice.entities.Tag;
import com.codewithnoelromero.springpactice.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
      var user = User.builder().name("John").password("pswd").email("noel.romero@gm.com").build();

        var profile = Profile.builder()
                        .bio("bio")
                                .build();
        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);


    }

}
