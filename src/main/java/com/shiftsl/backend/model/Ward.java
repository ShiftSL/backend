package com.shiftsl.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // HR Admin assigns a Ward Admin to this ward
    @OneToOne
    @JoinColumn(name = "ward_admin_id")
    private User wardAdmin;
}
