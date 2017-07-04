package SRS.service;

import java.util.List;

import SRS.dao.DaoFactory;
import SRS.dao.PlanOfStudyDao;
import SRS.model.Course;
import SRS.model.Student;


public class PlanOfStudyService {
	
	private PlanOfStudyDao dao = DaoFactory.createPlanOfStudyDao();
	
	
	public List<Course> findByStudent(Student student){
		List<Course> courses = dao.findByStudent(student);
		return courses;
	}
}
