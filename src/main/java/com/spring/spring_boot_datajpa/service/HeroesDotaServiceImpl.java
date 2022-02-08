package com.spring.spring_boot_datajpa.service;

import com.spring.spring_boot_datajpa.dao.HeroesDotaRepository;
import com.spring.spring_boot_datajpa.entity.HeroesDota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroesDotaServiceImpl implements HeroesDotaService {

    @Autowired
    private HeroesDotaRepository heroesDotaRepository;

    @Override
    public List<HeroesDota> getAllHeroesDota() {
        return heroesDotaRepository.findAll();
    }

    @Override
    public void saveHeroesDota(HeroesDota heroesDota) {
        heroesDotaRepository.save(heroesDota);
    }

    @Override
    public HeroesDota getHeroesDota(int id) {
        HeroesDota heroesDota = null;
        Optional<HeroesDota> optional = heroesDotaRepository.findById(id);
        if (optional.isPresent()) {
            heroesDota = optional.get();
        }
        return heroesDota;
    }

    @Override
    public void deleteHeroesDota(int id) {
        heroesDotaRepository.deleteById(id);
    }

    @Override
    public List<HeroesDota> findAllByName(String name) {
        List<HeroesDota> heroesDotas = heroesDotaRepository.findAllByName(name);
        return heroesDotas;
    }

}

