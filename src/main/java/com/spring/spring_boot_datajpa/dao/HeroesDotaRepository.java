package com.spring.spring_boot_datajpa.dao;


import com.spring.spring_boot_datajpa.entity.HeroesDota;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HeroesDotaRepository extends JpaRepository<HeroesDota, Integer> {
}


