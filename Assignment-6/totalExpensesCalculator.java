import java.util.Scanner;

public class totalExpensesCalculator {
    public static double calculateExpenses(int quantity, double pricePerItem) {
        double totalExpenses = quantity * pricePerItem;
        double discount = 0;

        if (quantity > 50) {
            discount = 0.1 * totalExpenses;
        } else if (quantity >= 25) {
            discount = 0.05 * totalExpenses;
        }

        totalExpenses -= discount;
        return totalExpenses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = calculateExpenses(quantity, pricePerItem);
        System.out.printf("Total expenses: $%.2f%n", totalExpenses);

        scanner.close();
    }
}
