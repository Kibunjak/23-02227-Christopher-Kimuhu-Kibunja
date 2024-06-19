//Java program to display all the multiples of 2, 3 and 7 within the range 71 to 150.

public class question4 
{
    public static void main(String[] args) 
    {
        //declaation of the two cases 
        int lowercase = 71;
        int uppercase = 150;

        System.out.println("Multiples of 2, 3, and 7 within the range " + lowercase + " to " + uppercase + ":");

        for (int number = lowercase; number <= uppercase; number++) 
        {
            if (number % 2 == 0 || number % 3 == 0 || number % 7 == 0) 
            {
                System.out.print(number + " ");
            }
        }
    }
}
