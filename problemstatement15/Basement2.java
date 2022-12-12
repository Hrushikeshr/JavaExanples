package problemstatement15;

public class Basement2 {


	private int noOfCars;

	public void cars(int noOfcars) {


		String [] slots2 = new String[15];
		this.noOfCars = noOfcars;

		System.out.println("For Car Parking(BASMENT-2):  Total slots are: " + slots2.length);
		for(int i = 0; i < slots2.length; i++) {

			System.out.println("slot-" + (i + 1) + "   ");

		}

		System.out.println("\nOccupied slots By(CARS, BASEMENT-2): ");
		for(int i = 0; i < noOfCars; i++) {

			slots2[i] = "Occupied !";

			System.out.println("slot-" + (i + 1) + " : " + slots2[i] + "Car - " + (i + 1));


		}

		int len = slots2.length;
		System.out.println("For Car Parking(BASMENT-2):  Avialable slots are: " + (len - noOfCars));
		for(int i  = noOfCars; i < slots2.length; i++) {


			System.out.println("slot-" + (i + 1) + "   ");

		}

	}
}