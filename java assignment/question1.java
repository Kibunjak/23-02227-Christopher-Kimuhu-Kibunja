//program that asks the user to enter their sur nae and current age 
//thne print the no of characters of their sir name and even or odd depending on their age no
import java.util.Scanner;
public class question1

{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        //ask for user input 
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the number of characters
        int numCharacters = surname.length();

        // Determine if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Print the no of charecters and whether the age number is odd or even
        System.out.println("The no of characters in ure surname is : " + numCharacters);
        System.out.println("Your current age is an " + ageType + " number.");
    }
}
