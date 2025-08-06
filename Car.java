public class Car {

	// Attributes
    String color;
    String model;
    int year;

	// Constructor
    public Car(String color, String model, 	int year) {
        	this.color = color;
            this.model = model;
            this.year = year;
        }

	// Method	
    public void startEngine() {
    	System.out.println("\nEngine started for the " + model);
    }
}
