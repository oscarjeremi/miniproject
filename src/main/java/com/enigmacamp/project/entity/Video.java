package com.enigmacamp.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "videos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
}
