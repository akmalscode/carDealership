package carDealership;

public class Customer {

	private String name;
	private String address;
	private double cashOnHand;

	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += "Dealrship City";
		this.address = address;
	}

	public double getCashOnHand() {
		cashOnHand += 900;
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle v, Employee emp, boolean fin) {
		emp.handleCustomer(this, fin, v);
	}

}
