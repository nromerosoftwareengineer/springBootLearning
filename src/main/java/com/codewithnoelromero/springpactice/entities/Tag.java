package com.codewithnoelromero.springpactice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "tags")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private Set<User> users = new HashSet<>();


    public Tag(String name) {
        this.name = name;
    }
}
