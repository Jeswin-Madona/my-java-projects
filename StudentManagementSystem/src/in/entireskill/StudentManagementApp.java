package in.entireskill;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Admin admin = new Admin("JeswinMadona");
	
	ArrayList<Student> studentList = new ArrayList<>();

	while (true) {
		admin.showMenu();
		System.out.println("Enter your choice: ");
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Student ID: ");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("Enter Student Name:");
			String name = s.nextLine();
			System.out.println("Enter Marks:");
			int marks = s.nextInt();
			studentList.add(new Student(id, name, marks));
			System.out.println("Student Added Successfully!");
			break;
			
		case 2:
			if (studentList.isEmpty()) {
				System.out.println("No Student Found");
			}else {
				for(Student st: studentList)
					st.display();
			}
			break;
			
		case 3:
			System.out.println("Enter Student ID to Update");
			int searchId = s.nextInt();
			boolean found = false;
			for(Student st: studentList) {
				if(st.getId()==searchId) {
					System.out.println("Enter New Marks");
					int newMarks = s.nextInt();
					st.setMarks(newMarks);
					System.out.println("Marks Updated!");
					found = true;
					break;
				}
				
			}
			if (!found) {
				System.out.print("Student not found");
			}
			break;
		case 4:
			System.out.println("Exit Successfuly!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice (should be 1 to 4)");
		}
	}
	}

}
