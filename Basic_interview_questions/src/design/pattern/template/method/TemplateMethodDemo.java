package design.pattern.template.method;

public class TemplateMethodDemo {
public static void main(String[] args) {
	WellsEmployees employee1 = new FullTime();
	WellsEmployees employee2 = new Contractor();
	employee1.getEmployeeReport();
	System.out.println("*******************************");
	employee2.getEmployeeReport();
}
}
