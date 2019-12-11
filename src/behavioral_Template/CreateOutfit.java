package behavioral_Template;

public abstract class CreateOutfit {
	public final void implyingmeasurements() {
		necklinedesigning();
		waistlinedesigning();
		customizesleeves();
		customizelength();
		System.out.println(" your dress is ready");
		
	}
	
	private void necklinedesigning() {
		System.out.println(" your dress will have V shaped neckline");
	}
	
	public void waistlinedesigning() {
		System.out.println(" your dress will be bow Waist dress ");
	}
	
	public abstract void customizesleeves();
	public abstract void customizelength();
	
	
}
