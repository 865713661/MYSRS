package SRS.service;

import java.util.HashMap;

import SRS.dao.CourseDao;
import SRS.dao.DaoFactory;
import SRS.model.Course;


public class CourseService {
	
	private CourseDao dao = DaoFactory.createCourseDao();
	
	public HashMap<String,Course> findAll(){
		HashMap<String,Course> courses = dao.findAll();
		return courses;
	}

	
}
