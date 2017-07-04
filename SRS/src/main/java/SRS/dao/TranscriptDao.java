package SRS.dao;

import java.util.HashMap;

import SRS.model.Section;
import SRS.model.TranscriptEntry;
import SRS.model.User;


public interface TranscriptDao  extends BaseDao{
	//查询所有选课
	public HashMap<String, TranscriptEntry> findAll();
	//查询所有学生选课
	public HashMap<String, TranscriptEntry> findTranscriptByStudent(User user);
	//选课
	public void addTranscript(TranscriptEntry transcriptentry);
	//删除已选课程
	public void deleteTranscript(String fullSectionNo,String studentSsn);
	//输入已选课程
	public void updateTranscript(String fullSectionNo, String ssn , String grade);
	//根据学号查询已选课程
	HashMap<String, TranscriptEntry> getTranscriptBySsn(User user);
	//根据课程号查询
	HashMap<String, TranscriptEntry> getBysection(Section se);
}
