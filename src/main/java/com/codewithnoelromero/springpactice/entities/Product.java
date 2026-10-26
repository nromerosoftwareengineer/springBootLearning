package com.codewithnoelromero.springpactice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.sql.ast.tree.expression.JsonTableColumnDefinition;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "Product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @Column( name = "id")
    private Long id;
    @Column( name = "name")
    private String name;
    @Column( name = "price", precision = 10, scale = 2)
    private BigDecimal price;
    @Column(name="description", columnDefinition = "TEXT", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ToString.Exclude
    private Category category;

    @ManyToMany(mappedBy = "products")
    @ToString.Exclude
    private Set<User> users = new HashSet<>();

}
