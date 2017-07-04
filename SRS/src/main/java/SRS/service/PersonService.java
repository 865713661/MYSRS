package SRS.service;

import java.util.HashMap;

import SRS.dao.DaoFactory;
import SRS.dao.PersonDao;
import SRS.model.Professor;
import SRS.model.Student;


public class PersonService {

	private PersonDao dao = DaoFactory.createPersonDao();
	
	public HashMap<String, Student> findAllStudents(){
		HashMap<String, Student> students = dao.findAllStudents();
		return students;
	}
	public HashMap<String, Professor> findAllProfessors(){
		HashMap<String, Professor> professors = dao.findAllProfessors();
		return professors;
	}
	
	
}
