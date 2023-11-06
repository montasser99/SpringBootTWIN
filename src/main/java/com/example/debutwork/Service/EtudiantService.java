package com.example.debutwork.Service;


import com.example.debutwork.Repository.EtudiantRepository;
import com.example.debutwork.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService implements EtudiantServiceImpl{

    @Autowired
    EtudiantRepository etudiantRepository;


    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {return etudiantRepository.save(etudiant);}
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant updateEtudiant(Etudiant etudiant, Long id) {
        Optional<Etudiant> existingEtudiantOptional = etudiantRepository.findById(id);

        if (existingEtudiantOptional.isPresent()) {
            Etudiant existingEtudiant = existingEtudiantOptional.get();
            existingEtudiant.setCin(etudiant.getCin());
            existingEtudiant.setEcole(etudiant.getEcole());
            existingEtudiant.setReservations(etudiant.getReservations());
            existingEtudiant.setPrenomEt(etudiant.getPrenomEt());
            existingEtudiant.setDateNaissance(etudiant.getDateNaissance());
            existingEtudiant.setNomEt(etudiant.getNomEt());
            return etudiantRepository.save(existingEtudiant);
        } else {
            return null;
        }
    }
    @Override
    public void deleteEtudiant(Long id) { etudiantRepository.deleteById(id); }
}