package SRS.addDATA;

import java.util.HashMap;

import SRS.addDATA.addData.creatFactory;
import SRS.dao.DaoFactory;
import SRS.dao.PersonDao;
import SRS.dao.SectionDao;
import SRS.dao.TranscriptDao;
import SRS.model.Section;

public class addData {
	
	public static class creatFactory{
	
	public static SectionDao sectionDao =  DaoFactory.createSectionDao();
	public static HashMap<String,Section> sections =sectionDao.findAll();
	public static PersonDao personDao =  DaoFactory.createPersonDao();
	public static TranscriptDao transcriptDao = DaoFactory.createTranscriptDao();
	}
}
