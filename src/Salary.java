import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter performance rating (1=excellent, 2=good, 3=poor): ");
        int rating = scanner.nextInt();

        // Compute raise based on performance rating
        if (rating == 1) {
            System.out.println("Congratulations, you won a 6% raise.");
        } else if (rating == 2) {
            System.out.println("Congratulations, you won a 4% raise.");
        } else if (rating == 3) {
            System.out.println("Congratulations, you won a 1.5% raise.");
        } else {
            System.out.println("Invalid rating entered. Please enter 1, 2, or 3.");
            return;
        }



    }
}
