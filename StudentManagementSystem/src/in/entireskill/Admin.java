package in.entireskill;

public class Admin extends User {
public Admin(String name) {
	super(name);
}

@Override
public void showMenu() {
	System.out.println("Welcome, Admin" +name);
	System.out.println("1. Add Student");
	System.out.println("2. View All Students");
	System.out.println("3. Update Student Marks");
	System.out.println("4. Exit");
}

	
}
