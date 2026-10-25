package com.codewithnoelromero.springpactice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "profiles")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "bio", columnDefinition = "TEXT")
    private String bio;
    @Column(name = "phone_number", length = 15)
    private String phoneNumber;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "loyalty_points")
    @Builder.Default
    private Integer loyaltyPoints = 0;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    @ToString.Exclude
    private User user;


}
