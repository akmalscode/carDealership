package carDealership;

public class MainCarDealership {

	public static void main(String[] args) {

		// All Customer
		Customer cust1 = new Customer("Akmal", "651 omnia", 233);
		Customer cust2 = new Customer("Arman", "652 omnia", 234);

		// All Vehicle
		Vehicle vehicle1 = new Vehicle("Toyota", "Hilander", 899);
		Vehicle vehicle2 = new Vehicle("Toyota", "Hilander", 999);

		Employee emp = new Employee();
		cust1.purchaseCar(vehicle1, emp, false);// Not approved for finance
		cust2.purchaseCar(vehicle2, emp, true);// Approve for finance

		boolean value = vehicle1.equals(vehicle2);
		System.out.println(value);

	}

}
