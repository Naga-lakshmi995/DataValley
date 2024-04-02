import java.util.Scanner;
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Datavalley_CustomException {
    public static void main(String[] args) {
        try {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
            checkNumber(n);
            System.out.println("Number is valid.");
        } catch (CustomValidationException e) {
            System.out.println("CustomValidationException : " + e.getMessage());
        }
    }

    public static void checkNumber(int num) throws CustomValidationException {
        if (num < 0) {
            throw new CustomValidationException("Number cannot be negative.");
        }
    }
}
