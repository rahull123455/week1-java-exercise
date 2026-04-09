package week1.exercise1.level3;

public class Student {

    // Fields
    String name;
    int age;

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create object
        Student student = new Student();

        // Assign values
        student.name = "John Doe";
        student.age = 20;

        // Call method
        student.displayInfo();
    }
}
