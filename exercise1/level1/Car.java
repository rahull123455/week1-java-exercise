package exercise1.level1;

public class Car {

    // Fields
    String model;
    int year;

    // Method to display info
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Create object
        Car myCar = new Car();

        // Assign values
        myCar.model = "Tesla Model S";
        myCar.year = 2024;

        // Call method
        myCar.displayInfo();
    }
}
