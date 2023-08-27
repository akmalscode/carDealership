package carDealership;

public class Employee {

	public void handleCustomer(Customer customer, boolean fin, Vehicle vehicle) {
		if (fin == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		} else if (vehicle.getPrice() <= customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Need more money to purchase the vehicle: " + vehicle + " " + vehicle.getPrice());
		}

	}

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getName() + " Customer has Purches the vehicle " + vehicle + "For the price: "
				+ vehicle.getPrice());

	}

	private void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println(customer.getName() + " Customer has approved");
	}

}
