import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        while (true) {
            String original, reverse = "";
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the string check palindrome:");
            original = in.nextLine();
            int length = original.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);

            }
            if (original.equals(reverse)) {
                System.out.println("palindrome");
            } else {
                System.out.println("Not palindrome");
            }
        }
    }
}
