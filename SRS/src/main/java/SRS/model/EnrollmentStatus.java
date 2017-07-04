package SRS.model;

public enum EnrollmentStatus {
	//结果分类
	success("Enrollment successful!"), 
	secFull("Enrollment failed;  section was full.  :op"), 
	prereq("Enrollment failed; prerequisites not satisfied.  :op"), 
	prevEnroll("Enrollment failed; previously enrolled.  :op");


	private final String value;

	
	EnrollmentStatus(String value) {
		this.value = value;
	}


	public String value() {
		return value;
	}
}

