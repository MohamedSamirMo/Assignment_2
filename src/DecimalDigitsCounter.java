import java.util.Scanner;

public class DecimalDigitsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        // Count the number of decimal digits
        int digitCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // Output the number of decimal digits
        System.out.println("The input contains " + digitCount + " digits.");
    }
}