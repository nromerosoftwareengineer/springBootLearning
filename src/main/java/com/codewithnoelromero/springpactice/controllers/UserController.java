package com.codewithnoelromero.springpactice.controllers;

import com.codewithnoelromero.springpactice.dtos.CreateUserRequest;
import com.codewithnoelromero.springpactice.dtos.UserDTO;
import com.codewithnoelromero.springpactice.entities.User;
import com.codewithnoelromero.springpactice.mappers.UserMapper;
import com.codewithnoelromero.springpactice.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest request,
                                             UriComponentsBuilder uriBuilder) {
        if (!StringUtils.hasText(request.name())
                || !StringUtils.hasText(request.email())
                || !StringUtils.hasText(request.password())) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Name, email, and password are required."
            );
        }

        var user = User.builder()
                .name(request.name())
                .email(request.email())
                .password(request.password())
                .build();
        var savedUser = userRepository.save(user);
        var location = uriBuilder.path("/users/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).body(userMapper.toDto(savedUser));
    }

    @GetMapping
    public Iterable<UserDTO> getAllUsers(@RequestParam(required = false, defaultValue = "")  String sort) {
        if ( !Set.of("name", "email").contains(sort) )
        {
            sort = "name";
        }
        return  userRepository.findAll(Sort.by(sort))
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") Long id){
        var user =  userRepository.findById(id).orElse(null);

        if ( user == null ) {

            return ResponseEntity.notFound().build();
        }


        return ResponseEntity.ok(userMapper.toDto(user));

    }
}
