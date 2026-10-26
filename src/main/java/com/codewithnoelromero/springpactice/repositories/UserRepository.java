package com.codewithnoelromero.springpactice.repositories;

import com.codewithnoelromero.springpactice.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
