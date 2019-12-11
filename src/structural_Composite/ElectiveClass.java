package structural_Composite;

public class ElectiveClass implements MyAllClasses {
	private String className;
	private String classNumber;
	
	public ElectiveClass(String classNumber, String className) {
		
		this.classNumber = classNumber;
		this.className = className;
	}

	@Override
	public void displayCourses() {
		System.out.println(classNumber + " " + className);
		
		
	}

}
