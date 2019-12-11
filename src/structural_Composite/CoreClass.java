package structural_Composite;

public class CoreClass implements MyAllClasses {
	private String className;
	private String classNumber;
	
	public CoreClass(String classNumber, String className) {
		this.classNumber = classNumber;
		this.className = className;
	}

	@Override
	public void displayCourses() {
		System.out.println(classNumber + " " + className);
		
		
	}

}
