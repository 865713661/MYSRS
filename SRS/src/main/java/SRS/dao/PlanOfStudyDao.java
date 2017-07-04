package SRS.dao;

import java.util.List;

import SRS.model.Course;
import SRS.model.Student;


public interface PlanOfStudyDao extends BaseDao {
	
	//通过查询所有的planOfStudy
	List<Course> findByStudent(Student student);
	

}
