import java.util.Scanner;
public class Replacechar {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        int indexToReplace = sc.nextInt();
        char replacementChar = sc.next().charAt(0);
        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }

        char[] chars = str.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}
