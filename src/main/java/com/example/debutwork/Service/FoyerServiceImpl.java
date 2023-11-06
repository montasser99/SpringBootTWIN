package com.example.debutwork.Service;

import com.example.debutwork.entity.Foyer;

import java.util.List;

public interface FoyerServiceImpl {
    Foyer addFoyer(Foyer foyer);
    List<Foyer> getAllFoyers();
    Foyer updateFoyer(Foyer foyer, Long id);
    void deleteFoyer(Long id);
}
