package com.acad.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acad.ms.entities.Hour;

public interface HourRepository extends JpaRepository<Hour,Integer> {
	

}
