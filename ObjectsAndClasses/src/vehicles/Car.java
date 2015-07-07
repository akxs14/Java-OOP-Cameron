package vehicles;

public class Car {
	private String registrationNumber;
	private String make;
	private String model;
	private int engineSize;
	private short yearFirstRegistered = 2015;

	public Car(String initialRegistrationNumber, String initialMake,
			String initialModel, int initialEngineSize,
			short initialYearFirstRegistered) {
		this.registrationNumber = initialRegistrationNumber;
		this.make = initialMake;
		this.model = initialModel;
		this.engineSize = initialEngineSize;
		this.yearFirstRegistered = initialYearFirstRegistered;
	}
	
	public void changeRegistrationNumber(String newRegistrationNumber) {
		registrationNumber = newRegistrationNumber;
	}
	
	public String getDescriptionOfCar() {
		String result = registrationNumber +
				"(" + yearFirstRegistered + "-" + make + ")";
		return result;
	}
}
