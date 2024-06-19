/*program to ask student to enter the marks of the five units they did last semester 
 * computing the average and dispalya it on the screen
*/
import java.util.Scanner;
public class question2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks for five units
        System.out.println("Enter marks for mathematisforscience:");
        double mathematisforscience = scanner.nextDouble();
        System.out.println("Enter marks for operatingsystems:");
        double operatingsystems = scanner.nextDouble();
        System.out.println("Enter marks for programmingmethodology:");
        double programmingmethodology = scanner.nextDouble();
        System.out.println("Enter marks for javaprogramming:");
        double javaprogramming = scanner.nextDouble();
        System.out.println("Enter marks for communocationskills:");
        double communocationskills = scanner.nextDouble();
        
        // Calculate the average
        double average = (mathematisforscience + operatingsystems + programmingmethodology + javaprogramming + communocationskills) / 5.0;

        // Display the average with two decimal places
        System.out.printf("Average marks: %.2f%n", average);

        // Close the scanner
        scanner.close();
    }
}
