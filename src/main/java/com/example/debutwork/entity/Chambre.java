package com.example.debutwork.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="chambre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude={"idChambre"},includeFieldNames= false)
public class Chambre implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeC TypeChambre ;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    private Set<Reservation> Reservations;
}
