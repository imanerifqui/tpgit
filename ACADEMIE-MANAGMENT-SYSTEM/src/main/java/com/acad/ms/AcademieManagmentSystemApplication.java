package com.acad.ms;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.acad.ms.dao.SubjectRepository;
import com.acad.ms.entities.Salle;
import com.acad.ms.entities.Subject;
import com.acad.ms.entities.Day;
import com.acad.ms.entities.GroupST;
import com.acad.ms.entities.Hour;
import com.acad.ms.entities.Level;
import com.acad.ms.entities.Month;
import com.acad.ms.entities.Professor;
import com.acad.ms.entities.ProfGroupMonth;
import com.acad.ms.entities.School;
import com.acad.ms.entities.Seance;
import com.acad.ms.entities.StudentGroup;
import com.acad.ms.entities.StudentSchoolYear;
import com.acad.ms.entities.SchoolYear;



@SpringBootApplication
public class AcademieManagmentSystemApplication {

	public static void main(String[] args) {
		/*ApplicationContext ctx=*/SpringApplication.run(AcademieManagmentSystemApplication.class, args);
		/*SubjectRepository sr=ctx.getBean(SubjectRepository.class);
		sr.save(new Subject(1,"a"));*/

		
	}

}
