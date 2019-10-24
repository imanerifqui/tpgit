package com.acad.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acad.ms.entities.Month;

public interface MonthRepository extends JpaRepository<Month,Integer> {

}
