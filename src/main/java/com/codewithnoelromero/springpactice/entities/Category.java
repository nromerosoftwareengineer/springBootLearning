package com.codewithnoelromero.springpactice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "categories")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category {
    @Id
    @Column( name = "id")
    private Byte id;
    @Column( name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    @Builder.Default
    private Set<Product> products = new HashSet<>();

}
