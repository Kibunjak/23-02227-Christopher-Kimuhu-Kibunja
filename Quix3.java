/*
Write a method that asks user to enter the year, the program should check if  the year is a leap year, and output the text the year you entered is a leap year. 

Create a java project, a package and a class, in the class, write a program to calculate the area of a triangle. The program should have thee non-static methods:
One of the methods should ask the user to enter the base and the height of a triangle.
The other method should compute the area of the rectangle.
The other method should output the calculated area of the triangle an display it to the user.
*/ 
import java.util.Scanner;

public class Quix3 {

    // Method to ask the user to enter the base and height of a triangle
    public void getInput() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }
    // Method to compute the area of the triangle
    public double computeArea() {
        return 0.5 * base * height;
    }
    // Method to output the calculated area of the triangle
    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }
    // Method to ask the user to enter a year and check if it's a leap year
    public void checkLeapYear() {
        scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
    // Variables to store base and height
    private double base;
    private double height;
    private Scanner scanner;

    public static void main(String[] args) {
        Quix3 calculator = new Quix3();
        calculator.getInput();
        double area = calculator.computeArea();
        calculator.displayArea(area);
        calculator.checkLeapYear();
    }
}
