package com.example.debutwork.Service;

import com.example.debutwork.Repository.ChambreRepository;
import com.example.debutwork.entity.Chambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreService implements ChambreServiceImpl {
    @Autowired
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }
    @Override
    public Chambre updateChambres(Chambre chambre, Long id) {
        Optional<Chambre> existingChambreOptional = chambreRepository.findById(id);

        if (existingChambreOptional.isPresent()) {
            Chambre existingChambre = existingChambreOptional.get();

            existingChambre.setNumeroChambre(chambre.getNumeroChambre());
            existingChambre.setTypeChambre(chambre.getTypeChambre());
            existingChambre.setBloc(chambre.getBloc());
            existingChambre.setReservations(chambre.getReservations());

            return chambreRepository.save(existingChambre);
        } else {
            return null;
        }
    }
    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}
