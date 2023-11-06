package com.example.debutwork.Service;

import com.example.debutwork.Repository.BlocRepository;
import com.example.debutwork.entity.Bloc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlocService implements BlocServiceImpl{
    @Autowired
    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
    return blocRepository.save(bloc);
    }
    @Override
    public List<Bloc> getBlocByCapacite(long capacite) {
        return blocRepository.findByCapaciteBlocLike(capacite);
    }
    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc updateBloc(Bloc bloc) {

        if (blocRepository.existsById(bloc.getIdBloc())) {
            return blocRepository.save(bloc);
        }
        return null ;
    }
    @Override
    public void deleteBloc(Long id) {
    blocRepository.deleteById(id);
    }
}
