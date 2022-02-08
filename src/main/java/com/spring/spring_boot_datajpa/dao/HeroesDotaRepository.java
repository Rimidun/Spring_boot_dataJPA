package com.spring.spring_boot_datajpa.dao;


import com.spring.spring_boot_datajpa.entity.HeroesDota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroesDotaRepository extends JpaRepository<HeroesDota, Integer> {
}


