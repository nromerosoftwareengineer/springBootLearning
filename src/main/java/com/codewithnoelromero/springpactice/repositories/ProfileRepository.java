package com.codewithnoelromero.springpactice.repositories;

import com.codewithnoelromero.springpactice.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
    
}
