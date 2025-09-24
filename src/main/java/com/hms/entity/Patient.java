package com.hms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "patients")   // optional but recommended
@Data                      // Lombok: generates getters, setters, toString, etc.
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String contact;
    private String medicalHistory;
}
