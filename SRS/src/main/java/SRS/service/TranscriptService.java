package SRS.service;

import java.util.HashMap;

import SRS.dao.DaoFactory;
import SRS.dao.TranscriptDao;
import SRS.model.TranscriptEntry;
import SRS.model.User;


public class TranscriptService {
	private TranscriptDao dao = DaoFactory.createTranscriptDao();
	
	public HashMap<String, TranscriptEntry> findTranscriptByStudent(User user){
		HashMap<String,TranscriptEntry> transcripts = dao.findTranscriptByStudent(user);
		return transcripts;
	}
}
