import java.util.Scanner;
public class DivisionByZero {
    public static void main(String[] args) {
        try {
	    Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
 	    int den=sc.nextInt();
            int result = divideNumbers(num,den);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
