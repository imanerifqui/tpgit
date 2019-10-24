package com.acad.ms.services;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acad.ms.dao.DayRepository;
import com.acad.ms.dao.GroupSTRepository;
import com.acad.ms.dao.HourRepository;
import com.acad.ms.dao.LevelRepository;
import com.acad.ms.dao.MonthRepository;
import com.acad.ms.dao.ProfGroupMonthRepository;
import com.acad.ms.dao.ProfessorRepository;
import com.acad.ms.dao.SalleRepository;
import com.acad.ms.dao.SchoolRepository;
import com.acad.ms.dao.SchoolYearRepository;
import com.acad.ms.dao.SeanceRepository;
import com.acad.ms.dao.StudentGroupRepository;
import com.acad.ms.dao.StudentRepository;
import com.acad.ms.dao.StudentSchoolYearRepository;
import com.acad.ms.dao.SubjectRepository;
import com.acad.ms.entities.Day;
import com.acad.ms.entities.GroupST;
import com.acad.ms.entities.Hour;
import com.acad.ms.entities.Professor;
import com.acad.ms.entities.Seance;
import com.acad.ms.entities.Student;

@Service("IAMSServices")

@Transactional
public class IAMSServicesImpl implements IAMSServices  {
	
	@Autowired
	DayRepository  dayRepository;
	
	@Autowired
	GroupSTRepository  groupRepository;
	
	@Autowired
	HourRepository  hourRepository;
	
	@Autowired
	LevelRepository  levelRepository;
	
	@Autowired
	MonthRepository  monthRepository;
	
	@Autowired
	ProfessorRepository  professorRepository;
	
	@Autowired
	ProfGroupMonthRepository  profGroupMonthRepository;
	
	@Autowired
	SalleRepository  salleRepository;
	
	@Autowired
	SchoolRepository  schoolRepository;
	
	@Autowired
	SchoolYearRepository  schoolYearRepository;
	
	@Autowired
	SeanceRepository  seanceRepository;
	
	@Autowired
	StudentGroupRepository studentGroupRepository;
	
	@Autowired
	StudentRepository  studentRepository;
	
	@Autowired
	StudentSchoolYearRepository  studentSchoolYearRepository;
	
	@Autowired
	SubjectRepository  subjectRepository;
	
	
	
	
	

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>)studentRepository.findAll();
		
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student getStudentByFName(String fName) {
		
		return studentRepository.getStudentByFName(fName);
	}

	@Override
	public Student getStudentByLName(String lName) {
		
		return studentRepository.getStudentByLName(lName);
	}

	@Override
	public Student getStudentByFullName(String fullName) {
		
		return studentRepository.getStudentByFullName(fullName);
	}

	@Override
	public List<Student> getStudentsByGroup(GroupST group) {
	
		return (List<Student>)studentRepository.getStudentsByGroup(group);
	}

	@Override
	public Student SaveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student UpdateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
/*****************************************/
	@Override
	public List<GroupST> getAllGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupST getGroupById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupST> getGroupsByProf(Professor professor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupST saveGroup(GroupST group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGroup(GroupST group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GroupST updateGroup(GroupST group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seance> getAllSeance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seance> getSeanceByDay(Day day) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seance> getSeanceByHour(Hour hour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professor> getAllProfessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor getProfessorById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor getProfessorByFullName(String fName, String lName) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
