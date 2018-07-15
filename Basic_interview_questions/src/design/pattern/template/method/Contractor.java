package design.pattern.template.method;

public class Contractor extends WellsEmployees{

	@Override
	public void applyLeave() {
		System.out.println("Apply leave in contractor parent leave portal and also drop mail to manager ");
	}

	@Override
	public void updateStamp() {
		System.out.println("Update Stamp in wells portal and also fill ocntractor tool");
	}

}
