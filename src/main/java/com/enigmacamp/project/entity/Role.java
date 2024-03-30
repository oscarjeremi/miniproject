package com.enigmacamp.project.entity;

import com.enigmacamp.project.constant.ERole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_role")
    private String id;
    @Enumerated(EnumType.STRING)
    private ERole name;
}
