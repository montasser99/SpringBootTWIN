package com.example.debutwork.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames= false, exclude = {"idReservation", "etudiants"})
public class Reservation  implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idReservation")
    private String idReservation;
    @Temporal (TemporalType.DATE)
    private Date anneeUniversitaire;
    @Column(name = "estValide")
    private boolean estValide;
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;
}
