package com.example.debutwork.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude={"idUniversite"},includeFieldNames= false)
public class Universite implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(mappedBy="universite")
    private Foyer foyer;
}
