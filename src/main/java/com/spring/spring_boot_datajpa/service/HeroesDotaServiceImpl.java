package com.spring.spring_boot_datajpa.service;

import com.spring.spring_boot_datajpa.dao.HeroesDotaRepository;
import com.spring.spring_boot_datajpa.entity.HeroesDota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HeroesDotaServiceImpl implements HeroesDotaService {

    @Autowired
    private HeroesDotaRepository heroesDotaDAO;

    @Override
    @Transactional
    public List<HeroesDota> getAllHeroesDota() {
        return heroesDotaDAO.getAllHeroesDota();
    }

    @Override
    @Transactional
    public void saveHeroesDota(HeroesDota heroesDota) {
        heroesDotaDAO.saveHeroesDota(heroesDota);
    }

    @Override
    @Transactional
    public HeroesDota getHeroesDota(int id) {
        return heroesDotaDAO.getHeroesDota(id);
    }

    @Override
    @Transactional
    public void deleteHeroesDota(int id) {
        heroesDotaDAO.deleteHeroesDota(id);
    }


}

