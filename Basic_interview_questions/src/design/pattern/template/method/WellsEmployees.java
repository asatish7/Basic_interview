package design.pattern.template.method;

public abstract class WellsEmployees {

	public void getEmployeeReport() {
		updateStamp();
		updateTrams();
		applyLeave();
		securityCheck();
	}

	public void securityCheck() {
		System.out.println("Common Security Check Done");
	}

	public abstract void applyLeave();

	public void updateTrams() {
		System.out.println("Common Transport Sstem Booked");
	}

	public abstract void updateStamp();
}
