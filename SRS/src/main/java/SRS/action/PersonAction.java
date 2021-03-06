package SRS.action;


import java.util.HashMap;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionSupport;

import SRS.dao.DaoFactory;
import SRS.dao.PersonDao;
import SRS.model.Professor;
import SRS.service.PersonService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class PersonAction extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	private JSONObject jsonObject = new JSONObject();
	private JSONArray jsonArray = new JSONArray();
	private String ssn;
	private String name;
	private String title;
	private String department;
	
	/**
	 * 
	* <p>Title: findAllProfessor</p>
	* <p>Description: 查询所有教师</p>
	* @return 
	 */
	public String findAllProfessor(){
		PersonService personService = new PersonService();
		HashMap<String, Professor> professors = personService.findAllProfessors();
		for(Entry<String,Professor> p : professors.entrySet()){
			JSONObject jo = new JSONObject();
			jo.put("ssn", p.getValue().getSsn());
			jo.put("name", p.getValue().getName());
			jo.put("title", p.getValue().getTitle());
			jo.put("department", p.getValue().getDepartment());
			jsonArray.add(jo);
		}
		return "jsonArray";
	}

	public String addProfessor(){
		jsonObject.put("status", "ok");
		Professor professor = new Professor(name, ssn, title, department);
		PersonDao personDao = DaoFactory.createPersonDao();
		personDao.addProfessor("Professor", professor);
		return "jsonObject";
	}

	public String deleteProfessor(){
		jsonObject.put("status", "ok");
		PersonService personService = new PersonService();
		HashMap<String, Professor> professors = personService.findAllProfessors();
		Professor professor = professors.get(ssn);
		PersonDao personDao = DaoFactory.createPersonDao();
		personDao.deleteProfessor(professor);
		return "jsonObject";
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
