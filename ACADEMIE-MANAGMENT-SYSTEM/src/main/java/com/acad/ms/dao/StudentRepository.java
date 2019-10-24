package com.acad.ms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.acad.ms.entities.GroupST;
import com.acad.ms.entities.Student;
@Repository("StudentRepository")

public interface StudentRepository extends JpaRepository<Student, Integer>{
 Student getStudentByFName(String fName);
 Student getStudentByLName(String lName);

 List<Student> getStudentsByGroup(GroupST group);
Student getStudentByFullName(String fullName);

}
