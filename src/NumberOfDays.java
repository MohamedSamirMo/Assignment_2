import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year and month
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        System.out.println("Enter the month (1-12):");
        int month =scanner.nextInt();
        // Arrangement 1-12 for Month
        if (month<1 || month>12){
            System.out.println("Invalid month. Please enter a number between 1 and 12");
            return;
        }
        // Calculate the number of days in the specified month
        // probable using If or Switch better
        int daysInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = -1; // Invalid month
        }

        // Output the number of days in the specified month
        if (daysInMonth != -1) {
            System.out.println("Number of days in month :" + month + " of year : " + year + ": " + daysInMonth);
        } else {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }
    }
}
