package com.acad.ms.services;

import java.util.List;




import com.acad.ms.entities.Day;
import com.acad.ms.entities.GroupST;
import com.acad.ms.entities.Hour;
import com.acad.ms.entities.Professor;
import com.acad.ms.entities.Seance;
import com.acad.ms.entities.Student;


public interface IAMSServices {
	//fonctions of Students
	public List<Student> getAllStudents();
	public Student getStudentById();
	public Student getStudentByFName(String fName);
	public Student getStudentByLName(String lName);
	public Student getStudentByFullName(String fullName);
	public List<Student> getStudentsByGroup(GroupST group);
	public Student SaveStudent(Student student);
	public void deleteStudent(Student student);
	public Student UpdateStudent(Student student);
	void deleteStudent(int id);
	
	
	//fonctions of Groups
	public List<GroupST> getAllGroups();
	public GroupST getGroupById();
	public List<GroupST> getGroupsByProf(Professor professor);
	public GroupST saveGroup(GroupST group);
	public void deleteGroup(GroupST group);
	public GroupST updateGroup(GroupST group);
	
	
	//fonctions of Seance
	public List<Seance> getAllSeance();
	public List<Seance> getSeanceByDay(Day day);
	public List<Seance> getSeanceByHour(Hour hour);
	
	
	//fonction of Professor
	public List<Professor> getAllProfessor();
	public Professor getProfessorById();
	public Professor getProfessorByFullName(String fName,String lName);
	Student getStudentById(int id);
	
	
	
}
