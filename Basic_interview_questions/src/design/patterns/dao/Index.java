package design.patterns.dao;

public class Index {
String ricCode;
String description;
String date;

public Index(String ricCode, String description, String date) {
	super();
	this.ricCode = ricCode;
	this.description = description;
	this.date = date;
}

public String getRicCode() {
	return ricCode;
}

public void setRicCode(String ricCode) {
	this.ricCode = ricCode;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}


}
