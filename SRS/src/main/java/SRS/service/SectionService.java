package SRS.service;

import java.util.HashMap;

import SRS.dao.DaoFactory;
import SRS.dao.SectionDao;
import SRS.model.Section;


public class SectionService {

	private SectionDao dao = DaoFactory.createSectionDao();
	
	public HashMap<String, Section> findAll(){
		HashMap<String, Section> sections = dao.findAll();
		return sections;
	}
	
}
