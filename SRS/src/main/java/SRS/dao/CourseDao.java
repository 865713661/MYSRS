package SRS.dao;

import java.util.HashMap;

import SRS.model.Course;

public interface CourseDao extends BaseDao{
	
	public Course getByCourseNo(String CourseNo);
	//查询所有课程
	public HashMap<String, Course> findAll();
	//添加课程
	void addCourse(Course course);
	//修改课程
	void updateCourse(Course course);
	//删除课程
	void deleteCourse(Course course);
}
