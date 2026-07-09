import java.lang.reflect.Array;

public class Student {
	private String first_name, last_name, major;
	private char middle_initial;
	private double gpa;
	private final int student_ID;
	//private static Student[] students;

	public Student(String first, String last, char MI, String major, double GPA, int ID) {
		this.first_name=first;
		this.last_name=last;
		this.middle_initial = MI;
		this.major=major;
		this.gpa = GPA;
		this.student_ID = ID;
	}
	// getters
	public String getFirstname() {
		return first_name;
	}
	public double getGpa() {
		return gpa;
	}
	public String getLastName(){
		return last_name;

	}
	public String getMajor() {
		return major;
	}
	public char getMiddle_initial() {
		return middle_initial;
	}
	public int getStudent_ID() {
		return student_ID;
	} //setters
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setMiddle_initial (char middle_initial) {
		this.middle_initial = middle_initial;
	}
	public void setGpa(double gpa) {
		if (gpa > 0 && gpa <= 4.0){
			this.gpa = gpa;
		}
	}
	public String toCSV(){
		return student_ID + "," + last_name + "," + first_name + "," + middle_initial + "," + major + "," + gpa;
	}
// add constructure student calss
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return student.student_ID == this.student_ID;
		} else {
			return false;
		}
	}

    @Override
    public String toString() {
        return major + "\n\t" + last_name + ", " + first_name + " " + middle_initial + ", " + student_ID; //add the tab after the major to match the format
    }
}