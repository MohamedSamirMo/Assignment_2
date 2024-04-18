import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int numberOne=scanner.nextInt();
        int numberTwo=scanner.nextInt();
        // Display Choice Operation
        System.out.println("Enter Operation Available");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        int Choice=scanner.nextInt();
        double result=0;
        switch (Choice){
            case 1:
               result= numberOne+numberTwo;
               break;
            case 2:
                result= numberOne-numberTwo;
                break;
            case 3:
                result= numberOne*numberTwo;
                break;
            case 4:
                if (numberTwo!=0){ result= (double) numberOne/numberTwo;}
                else {
                    System.out.println("Error! Division by zero ");
                    // Exiting the program if an invalid choice is entered
                    return;
                }

                break;
            case 5:
                result= numberOne%numberTwo;
                break;
            default:
                System.out.println("Invalid Choice");
                // Exiting the program if an invalid choice is entered
                return;
        }

        System.out.println("Result :"+result);


    }
}
