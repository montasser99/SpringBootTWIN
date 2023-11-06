package com.example.debutwork.Service;

import com.example.debutwork.entity.Chambre;

import java.util.List;

public interface ChambreServiceImpl {
    Chambre addChambre(Chambre chambre);
    List<Chambre> getAllChambres();
    Chambre updateChambres(Chambre chambre, Long id);
    void deleteChambre(Long id);


}
