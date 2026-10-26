package com.codewithnoelromero.springpactice;



import com.codewithnoelromero.springpactice.entities.User;
import com.codewithnoelromero.springpactice.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);
        repository.deleteById(1l);
        repository.findAll().forEach(u -> System.out.println(u.getEmail()));

    }

}
