package com.example.debutwork.Service;

import com.example.debutwork.Repository.ChambreRepository;
import com.example.debutwork.Repository.FoyerRepository;
import com.example.debutwork.entity.Foyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoyerService implements FoyerServiceImpl {
    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) { return foyerRepository.save(foyer); }
    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }
    @Override
    public Foyer updateFoyer(Foyer foyer, Long id) {
        Optional<Foyer> existingFoyerOptional = foyerRepository.findById(id);

        if (existingFoyerOptional.isPresent()) {
            Foyer existingFoyer = existingFoyerOptional.get();

            existingFoyer.setNomFoyer(foyer.getNomFoyer());
            existingFoyer.setBlocs(foyer.getBlocs());
            existingFoyer.setUniversite(foyer.getUniversite());
            existingFoyer.setCapaciteFoyer(foyer.getCapaciteFoyer());

            return foyerRepository.save(existingFoyer);
        } else {
            return null;
        }
    }
    @Override
    public void deleteFoyer(Long id) { foyerRepository.deleteById(id); }
}
