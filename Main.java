public class Main {
	
	public static void main(String[] args) {
		//CourseRoster roster = new CourseRoster("CS","164");
		//Student demo = new Student("Logan", "Seabolt", 'K', "Computer Science", 3.7, 831460820);
		//while(roster.addStudent(demo));
		//System.out.println(roster);
		 // Create students
        Student s1 = new Student("John", "Smith", 'A', "CS", 3.5, 1001);
        Student s2 = new Student("Maria", "Lopez", 'B', "Math", 3.8, 1002);
        Student s3 = new Student("David", "Lee", 'C', "Physics", 3.2, 1003);

        // Create a course roster
        CourseRoster roster = new CourseRoster("CS", "101");

        // Add students
        roster.addStudent(s1);
        roster.addStudent(s2);
        roster.addStudent(s3);

        // Print roster
        System.out.println("Course Roster:");
        System.out.println(roster);

        // Find student by ID
        Student found = roster.find(1002);
        System.out.println("\nFind by ID 1002:");
        System.out.println(found);

        // Find by name
        System.out.println("\nFind by name Maria Lopez:");
        System.out.println(roster.findByName("Maria", "Lopez"));

        // Remove student
        roster.removeStudent(s2);

        System.out.println("\nRoster after removing Maria Lopez:");
        System.out.println(roster);
    
	}
}
