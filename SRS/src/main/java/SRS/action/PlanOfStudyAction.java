package SRS.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionSupport;

import SRS.model.Course;
import SRS.model.Professor;
import SRS.model.Student;
import SRS.service.PersonService;
import SRS.service.PlanOfStudyService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class PlanOfStudyAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String ssn;

	private JSONObject jsonObject = new JSONObject();
	private JSONArray jsonArray = new JSONArray();
	
	

	public String findAllPlan(){
		PlanOfStudyService planOfStudyService = new PlanOfStudyService();
		PersonService personService = new PersonService();
		HashMap<String, Student> students = personService.findAllStudents();
		List<Course> courses = planOfStudyService.findByStudent(students.get(ssn));
		for(Course c : courses){
			JSONObject jo = new JSONObject();
			jo.put("courseNo", c.getCourseNo());
			jo.put("courseName", c.getCourseName());
			jo.put("credits", c.getCredits());
			jsonArray.add(jo);
		}
		return "jsonArray";
	}
	

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	

}
