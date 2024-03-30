package com.enigmacamp.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {
    @Id
    @Column(name = "id_admin")
    @GeneratedValue(strategy = GenerationType.UUID )
    private String id;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
