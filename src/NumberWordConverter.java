import java.util.Scanner;

public class NumberWordConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the string containing words and numbers
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        // Convert numbers to words
        String output = "";
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                switch (c) {
                    case '0': output += "zero "; break;
                    case '1': output += "one "; break;
                    case '2': output += "two "; break;
                    case '3': output += "three "; break;
                    case '4': output += "four "; break;
                    case '5': output += "five "; break;
                    case '6': output += "six "; break;
                    case '7': output += "seven "; break;
                    case '8': output += "eight "; break;
                    case '9': output += "nine "; break;
                    default:
                        System.out.println("Wrong words");
                        return;
                }
            } else {
                output += word;
                output += c;
                word = "";
            }
        }

        output += word;

        // Output the modified string
        System.out.println("Output: " + output);
    }
}
