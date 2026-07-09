public class CourseRoster {
	private Student[] students;
	private String department, course_ID;
	
	public CourseRoster(String dept, String id) {
		this.department=dept;
		this.course_ID =id;
		this.students = new Student[100];
	}
	public CourseRoster(int capacity) {
		this("N/A", "000");
		this.students = new Student[capacity];
	}
	public CourseRoster(String department, String ID, int capacity) {
		this.department = department;
		this.course_ID = ID;
		this.students = new Student[capacity];
	}
	public boolean addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {// Found an open seat!
				students[i] = student;
				return true;
			}
		}
		return false;
	}
	public boolean removeStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {// Empty Seat Skip!
				continue;
			}
			if(students[i].equals(student)) {// Found the student
				for (int j = i; j < students.length - 1; j++) {
					students[j] = students[j + 1];
				}
				students[students.length - 1] = null;
				return true;
			}
		}
		return false;
	}
	public Student find(int ID) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudent_ID()== ID) {
				return students[i];
			}
		}
		return null;
	}
	public String findByName(String first, String last) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getFirstname().equals(first) && students[i].getLastName().equals(last)) {
				return students[i].toString();
			}
		}
		return null;
	}

    @Override
    public String toString() {
        String out = department + " " + course_ID;
		for (Student s : students) {
			if( s != null){
			out += "\n\t"+s;
			}
		}
		return out;
    }
	
}
