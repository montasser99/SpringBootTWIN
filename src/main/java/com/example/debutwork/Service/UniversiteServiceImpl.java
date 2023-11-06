package com.example.debutwork.Service;

import com.example.debutwork.entity.Universite;

import java.util.List;

public interface UniversiteServiceImpl {
    Universite addUniversite(Universite universite);
    List<Universite> getAllUniversites();
    Universite updateUniversite(Universite universite, Long id);
    void deleteUniversite(Long id);

    Universite findUniversitesByChambreId(Long chambreId);
}
