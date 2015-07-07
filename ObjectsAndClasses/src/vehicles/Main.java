package vehicles;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("HGS928", "Ford", "Focus", 1800,
				(short)2010);
		System.out.println(car1.getDescriptionOfCar());
	}
}
