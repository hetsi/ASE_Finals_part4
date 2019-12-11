package structural_Composite;

import java.util.ArrayList;
import java.util.List;

public class EnrollingCart implements MyAllClasses{
	
	private List<MyAllClasses> totalClass = new ArrayList<MyAllClasses>();

	@Override
	public void displayCourses() {
		for(MyAllClasses allclasses : totalClass) {
			allclasses.displayCourses();
		}	
	}
	
	public void addClass(MyAllClasses newClass) {
		totalClass.add(newClass);
		
	}
	
	public void dropClass(MyAllClasses dropClass)
	{
		totalClass.remove(dropClass);
	}

}
