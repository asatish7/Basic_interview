package java8.groupby;

public class Client {
	int quantity;
	String clientName;
	double commission;
	
	
	public Client(int quantity, String clientName, double commission) {
		super();
		this.quantity = quantity;
		this.clientName = clientName;
		this.commission = commission;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
	

}
