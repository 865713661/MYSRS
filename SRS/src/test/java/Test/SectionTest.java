package Test;


import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

import SRS.addDATA.addData.creatFactory;
import SRS.dao.DaoFactory;
import SRS.dao.TranscriptDao;
import SRS.model.Course;
import SRS.model.EnrollmentStatus;
import SRS.model.Section;
import SRS.model.Student;
import SRS.model.TranscriptEntry;
import SRS.model.User;
import SRS.sqliteDao.SectionDaoImpl;

public class SectionTest {

	@Test
	public void testisOnly() {
		//模型加数据
		Student student=new Student("1");
		Course course=new Course("1","数学",4);
		Course course2=new Course("2","英语",3);
		Section section=new Section(1,"周一","8:00",course,"教一",1);
		Section section2=new Section(2,"周二","8:00",course2,"教一",2);
		//把数学课放入已选
		TranscriptEntry trascrip=new TranscriptEntry(student,"1",section);
		HashMap<String, TranscriptEntry> trans=new HashMap<>();
		trans.put("数学", trascrip);
		//能否选数学
		if(section.isOnly(section,trans)){
			System.out.println("已存在该课");
		}
		//能否选英语
		if(section.isOnly(section2,trans)){
			System.out.println("已存在该课");
		}else{
			System.out.println("可选");
		}
		
		}

	
	
}
