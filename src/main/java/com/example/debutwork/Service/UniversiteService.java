package com.example.debutwork.Service;

import com.example.debutwork.Repository.EtudiantRepository;
import com.example.debutwork.Repository.UniversiteRepository;
import com.example.debutwork.entity.Universite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UniversiteService implements UniversiteServiceImpl {
    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    @Override
    public List<Universite> getAllUniversites() { return universiteRepository.findAll();}
    @Override
    public Universite updateUniversite(Universite universite, Long id) {
        Optional<Universite> existingUniversiteOptional = universiteRepository.findById(id);

        if (existingUniversiteOptional.isPresent()) {
            Universite existingUniversite = existingUniversiteOptional.get();

            existingUniversite.setNomUniversite(universite.getNomUniversite());
            existingUniversite.setFoyer(universite.getFoyer());
            existingUniversite.setAdresse(universite.getAdresse());

            return universiteRepository.save(existingUniversite);
        } else {
            return null;
        }
    }
    @Override
    public void deleteUniversite(Long id) { universiteRepository.deleteById(id); }

    @Override
    public Universite findUniversitesByChambreId(Long chambreId) {
        return null;
    }

    /*
    @Override
    public Universite findUniversitesByChambreId(Long chambreId) {

        return universiteRepository.findUniversitesByChambreId(chambreId);
    }
    */



}
