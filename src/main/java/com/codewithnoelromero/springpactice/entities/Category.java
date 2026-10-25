package com.codewithnoelromero.springpactice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedList;
import java.util.List;

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
    @Column(nullable = false, name = "id")
    private Byte id;
    @Column(nullable = false, name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    @Builder.Default
    private List<Product> products = new LinkedList<>();

}
