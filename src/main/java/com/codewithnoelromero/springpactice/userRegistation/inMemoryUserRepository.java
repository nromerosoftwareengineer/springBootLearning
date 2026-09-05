package com.codewithnoelromero.springpactice.userRegistation;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class inMemoryUserRepository implements UserRepository {

    private HashMap<String, User> memory;

    public inMemoryUserRepository() {
        this.memory = new HashMap<>();
    }

    @Override
    public void save(User user) {
        this.memory.put(user.getEmail(), user);
        System.out.println("user: " + user.getName() + "is saved in memory");
    }
}
