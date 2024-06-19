//a program that will help kids learn divisibly test of numbers of integers
import java.util.Scanner;

public class question3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // ask for user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility for digits 0 to 9
        for (int divisor = 0; divisor <= 9; divisor++) 
        {
            if (number % divisor == 0) 
            {
                System.out.printf("The number is divisible by %d%n", divisor);
            }
        }
        scanner.close();
    }
}
