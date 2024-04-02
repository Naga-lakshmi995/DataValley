import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        if (daysLate <= 7) {
            System.out.println("Fine: 50 paise");
        } else if (daysLate >= 8 && daysLate <= 14) {
            System.out.println("Fine: Rs. 1");
        } else if (daysLate > 14 && daysLate <= 21) {
            System.out.println("Fine: Rs. 5");
        } else {
            System.out.println("Membership canceled due to excessive delay.");
        }

        scanner.close();
    }
}
