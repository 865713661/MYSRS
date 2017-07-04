package SRS.service;




import SRS.dao.SectionDao;
import SRS.model.ScheduleOfClasses;



public class ScheduleOfClassesService {
	
    private static ScheduleOfClasses sc;


    public ScheduleOfClasses getScheduleOfClasses() {
		return sc;
	}    
   
    
    public ScheduleOfClassesService(String semester, SectionDao dao){
    	sc = new ScheduleOfClasses(semester, dao.findBySemester(semester));
    }
  



}
