package com.codewithnoelromero.springpactice.services;

import com.codewithnoelromero.springpactice.entities.Address;
import com.codewithnoelromero.springpactice.entities.User;
import com.codewithnoelromero.springpactice.repositories.AddressRepository;
import com.codewithnoelromero.springpactice.repositories.ProfileRepository;
import com.codewithnoelromero.springpactice.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final ProfileRepository profileRepository;
    private final AddressRepository addressRepository;

    @Transactional
    public void showEntityStates() {
        var user = User.builder()
                .name("john same")
                .email("noel.doe@ex.com")
                .password("123noel")
                .id(1l)
                .build();

        if (entityManager.contains(user)) {
            System.out.println("User already exists");
        }else {

            System.out.println("not presistant");
        }

        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("User already exists");
        }else {

            System.out.println("not presistant");
        }
    }
    @Transactional
    public void showRelatedEntities() {
        var entity  = profileRepository.findById(1L).orElseThrow();
        System.out.println(entity.getUser().getEmail());
    }

    public void fetchAddress() {
       var address = addressRepository.findById(1l).orElseThrow();
        System.out.println(address);
    }

    public void persistRelated() {
        var user = User.builder()
                .name("noel rome")
                .email("test@gmail.com")
                .password("passcode")
                .build();

        var address = Address.builder()
                .street("aust street")
                .city("lufkin")
                .state("tx")
                .zip("75094")
                .build();

        user.addAddress(address);

        userRepository.save(user);

    }

    @Transactional
    public void deleteRelated() {
       var user = userRepository.findById(3L).orElseThrow();
       var address = user.getAddresses().getFirst();
       user.removeAddress(address);
       userRepository.save(user);
    }
}
