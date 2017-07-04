package SRS.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionSupport;

import SRS.addDATA.addData.creatFactory;
import SRS.dao.CourseDao;
import SRS.dao.DaoFactory;
import SRS.dao.PersonDao;
import SRS.dao.SectionDao;
import SRS.dao.TranscriptDao;
import SRS.model.Course;
import SRS.model.EnrollmentStatus;
import SRS.model.PlanOfStudy;
import SRS.model.Professor;
import SRS.model.Section;
import SRS.model.Student;
import SRS.model.TranscriptEntry;
import SRS.model.User;
import SRS.service.CourseService;
import SRS.service.PersonService;
import SRS.service.PlanOfStudyService;
import SRS.service.SectionService;
import SRS.sqliteDao.SectionDaoImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class SectionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private JSONObject jsonObject = new JSONObject();
	private JSONArray jsonArray = new JSONArray();
	private String sectionNo;
	private String dayOfWeek;
	private String timeOfDay;
	private String room;
	private int seatingCapacity;
	private String professorSsn;
	private String courseNo;
	private String semester;
	private String ssn;
	private String grade;

	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String findAllSection(){
		SectionService sectionService = new SectionService();
		HashMap<String,Section> sections = sectionService.findAll();
		for(Entry<String,Section> s : sections.entrySet()){
			JSONObject jo = new JSONObject();
			jo.put("sectionNo", s.getValue().getSectionNo());
			jo.put("dayOfWeek", s.getValue().getDayOfWeek());
			jo.put("timeOfDay", s.getValue().getTimeOfDay());
			jo.put("room", s.getValue().getRoom());
			jo.put("seatingCapacity", s.getValue().getSeatingCapacity());
			jo.put("professor", s.getValue().getInstructor().getName());
			jo.put("course", s.getValue().getRepresentedCourse().getCourseName());
			jsonArray.add(jo);
		}
		return "jsonArray";
	}

	public String addSection(){
		jsonObject.put("status", "ok");
		PersonService personService = new PersonService();
		CourseService courseService = new CourseService();
		HashMap<String, Professor> professors = personService.findAllProfessors();
		Professor professor = professors.get(professorSsn);
		HashMap<String, Course> courses = courseService.findAll();
		Course course = courses.get(courseNo);
		Section section =new Section(Integer.parseInt(sectionNo), dayOfWeek.charAt(0), timeOfDay , course ,room ,seatingCapacity);
		SectionDao sectionDao =  DaoFactory.createSectionDao();
		sectionDao.addSection(section,professor,semester);
		return "jsonObject";
	}
	
	public String mydelete(){
		jsonObject.put("status", "ok");
		TranscriptDao transcriptDao = DaoFactory.createTranscriptDao();
		transcriptDao.deleteTranscript(grade, ssn);
		return "jsonArray";
		
	}
	
	public String addTranscript(){
		
		//给模型加入数据
		PersonService personService = new PersonService();
		HashMap<String, Student> students = personService.findAllStudents();
		User user = new User();
		user.setSsn(ssn);
	    Section section = creatFactory.sections.get(sectionNo);
	    Student student = students.get(ssn);
	    PlanOfStudy planOfStudy = new PlanOfStudy(student); 
		PlanOfStudyService planOfStudyService = new PlanOfStudyService();
		List<Course> courses = planOfStudyService.findByStudent(students.get(ssn));
		HashMap<String, TranscriptEntry> transcripts = creatFactory.transcriptDao.getTranscriptBySsn(user);
		
       //利用模型进行选课逻辑判断
	   //是否已经选过该课
	   //是否在计划中
	   //是否满足条件或者容量已满
	    boolean aa = section.isOnly(section, transcripts);
	    boolean bb = planOfStudy.VerifyPlan(section,courses);
	    if(aa==false){
	    if(bb==true){
	    	EnrollmentStatus status = section.enroll(student);
		    if(status.value().equals("Enrollment successful!")){
		  	
		    //选课放入数据库
			   TranscriptEntry transcriptEntry = new TranscriptEntry(student, null, section);
			   creatFactory.transcriptDao.addTranscript(transcriptEntry);
			   SectionDaoImpl sectionDaoImpl = new SectionDaoImpl();
			   sectionDaoImpl.updateSection(section);
			   jsonObject.put("status", "ok");
			   section.setSeatingCapacity(section.getSeatingCapacity()-1);	  
			   creatFactory.sectionDao.updateSection(section);
			   
		   }else if(status.value().equals("Enrollment failed;  section was full.  :op")){
			   jsonObject.put("status", "full");
			 
		   }else{
			   jsonObject.put("status", "cant");
		   }
	    }else{
	    	jsonObject.put("status", "no");
	    }
	    }else{
	    	jsonObject.put("status", "two");
	    }
	    
	   return "jsonObject";
	}

	public String getBySsn(){
		TranscriptDao transcriptDao = DaoFactory.createTranscriptDao();
		User user = new User();
		user.setSsn(ssn);
		HashMap<String, TranscriptEntry> transcripts = transcriptDao.getTranscriptBySsn(user);
		for(Entry<String,TranscriptEntry> c : transcripts.entrySet()){
			JSONObject jo = new JSONObject();
			jo.put("sectionNo", c.getValue().getSection().getSectionNo());
			jo.put("dayOfWeek", c.getValue().getSection().getDayOfWeek());
			jo.put("timeOfDay", c.getValue().getSection().getTimeOfDay());
			jo.put("room", c.getValue().getSection().getRoom());
			jo.put("professor", c.getValue().getSection().getInstructor().getName());
			jo.put("course", c.getValue().getSection().getRepresentedCourse().getCourseName());
			jo.put("grade", c.getValue().getGrade());
			jsonArray.add(jo);
		}
		return "jsonArray";
	}
	
	/**
	 * 
	* <p>Title: getProfessorSection</p>
	* <p>Description: 查询教师教授课程选课情况</p>
	* @return
	 */
	public String getProfessorSection(){
		SectionDao sectionDao =  DaoFactory.createSectionDao();
		User user = new User();
		user.setSsn(ssn);
		HashMap<String, Section> sections = sectionDao.findByProfessor(user);
		for(Entry<String,Section> s : sections.entrySet()){
			JSONObject jo = new JSONObject();
			jo.put("sectionNo", s.getValue().getSectionNo());
			jo.put("dayOfWeek", s.getValue().getDayOfWeek());
			jo.put("timeOfDay", s.getValue().getTimeOfDay());
			jo.put("room", s.getValue().getRoom());
			jo.put("seatingCapacity", s.getValue().getSeatingCapacity());
			jo.put("course", s.getValue().getRepresentedCourse().getCourseName());
			jsonArray.add(jo);
		}
		return "jsonArray";
	}
	

	public String getDetial(){
		TranscriptDao transcriptDao = DaoFactory.createTranscriptDao();
		SectionDao sectionDao =  DaoFactory.createSectionDao();
		Section section = sectionDao.findAll().get(sectionNo);
		HashMap<String, TranscriptEntry> transcripts = transcriptDao.getBysection(section);
		for(Entry<String,TranscriptEntry> c : transcripts.entrySet()){
			JSONObject jo = new JSONObject();
			jo.put("name", c.getValue().getStudent().getName());
			jo.put("grade", c.getValue().getGrade());
			jsonArray.add(jo);
		}
		return "jsonArray";
	}
	
	
	

	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	public JSONArray getJsonArray() {
		return jsonArray;
	}
	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}
	
	public String getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getProfessorSsn() {
		return professorSsn;
	}

	public void setProfessorSsn(String professorSsn) {
		this.professorSsn = professorSsn;
	}

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
}
