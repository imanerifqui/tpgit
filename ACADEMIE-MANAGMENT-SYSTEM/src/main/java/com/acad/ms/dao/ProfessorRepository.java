package com.acad.ms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acad.ms.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
