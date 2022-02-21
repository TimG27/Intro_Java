package Chapter_12;
import java.util.Scanner;

public class QuotientWithException {
    public static int quotient (int number1, int number2) {
        if (number2 == 0) 
            throw new ArithmeticException("Divisor cannot be zero");

    return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter two Integers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            int result = quotient(n1, n2);
            System.out.println (n1 + "/" + n2 + " is " + result );
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cant be divided by 0");
        }

        System.out.println ("Execution continues...");

        input.close();
    }
}