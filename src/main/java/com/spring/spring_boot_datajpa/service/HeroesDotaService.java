package com.spring.spring_boot_datajpa.service;


import com.spring.spring_boot_datajpa.entity.HeroesDota;


import java.util.List;

public interface HeroesDotaService {

    public List<HeroesDota> getAllHeroesDota();

    public void saveHeroesDota(HeroesDota heroesDota);

    public HeroesDota getHeroesDota(int id);

    public void deleteHeroesDota(int id);

    public List<HeroesDota> findAllByName(String name);
}
