import java.util.Scanner;

public class Countvc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int vc = 0;
        int cc = 0;

        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vc++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println("Number of vowels: " + vc);
        System.out.println("Number of consonants: " + cc);
    }
}
