package design.pattern.template.method;

public class FullTime extends WellsEmployees{

	@Override
	public void applyLeave() {
		System.out.println("Apply leave in wells leave portal");
		
	}

	@Override
	public void updateStamp() {
		System.out.println("Update Stamp in wells portal");
	}

}
