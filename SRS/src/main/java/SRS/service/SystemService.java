package SRS.service;


import SRS.dao.CourseDao;
import SRS.dao.DaoFactory;
import SRS.dao.PersonDao;
import SRS.dao.SectionDao;
import SRS.dao.TranscriptDao;

public class SystemService {
	
	SectionDao sectionDao =  DaoFactory.createSectionDao();
	CourseDao courseDao =  DaoFactory.createCourseDao();
	PersonDao personDao =  DaoFactory.createPersonDao();
	TranscriptDao transcriptDao = DaoFactory.createTranscriptDao();
	
}
