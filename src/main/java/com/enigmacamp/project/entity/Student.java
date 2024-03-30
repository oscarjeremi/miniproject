package com.enigmacamp.project.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "students")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SQLDelete(sql = "UPDATE students SET deleted = true WHERE id_student = ?")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    @Column(name = "id_student")
    private String id;
    @Column(name = "fullname", nullable = false)
    private String fullname;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    private String phone;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
