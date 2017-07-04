package SRS.dao;

import java.util.HashMap;



public interface ScheduleDao  extends BaseDao{
	
	public HashMap<String, SectionDao> getScheduleOfClass(String semester);
	public void addToSchedule(String sectionNo, String semester);
	
}
