package com.example.debutwork.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="bloc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude={"idBloc"},includeFieldNames= false)
public class Bloc implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc;
    private String nomBloc ;
    private Long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;
    @ManyToOne
    private Foyer foyers;

}
