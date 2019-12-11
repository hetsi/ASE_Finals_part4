package structural_Composite;

public class FinalEnrolledClasses {
	public static void main (String args[]) {
		MyAllClasses core1 = new CoreClass("csc5800", "Advance Software Engineering");
		MyAllClasses core2 = new CoreClass("csc5300", "Advance Algorithms design and analysis");
		
		
		MyAllClasses elective1 = new ElectiveClass("csc5990", "Machine Learning");
		MyAllClasses elective2 = new ElectiveClass("csc5700", "Human Computer Interaction");
		
		EnrollingCart cart = new EnrollingCart();

		
		cart.addClass(elective1);
		cart.addClass(elective2);
		cart.addClass(core1);
		cart.addClass(core2);
		cart.displayCourses();

		System.out.println();

		cart.dropClass(elective1);
		cart.displayCourses();
		
	}

}
