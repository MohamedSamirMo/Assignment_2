import java.util.Scanner;

public class FloatSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Enter three floating-point numbers
        System.out.println("Enter three floating-point numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        // Calculator max and min like 1,2,3 to 3,2,1
        float max , mid ,min;
        // if n1>n2,n3
        if (num1>=num2 && num1>=num3){
            max=num1;
            if (num2>=num3){
                mid=num2;
                min=num3;
            }else {
                mid=num3;
                min=num2;
            }
        }
        // if n2>n1,n3
        else if (num2>=num1 && num2>=num3){
            max=num2;
            if (num1>=num3){
                mid=num1;
                min=num3;
            }else {
                mid=num3;
                min=num1;
            }
        }
        // if n3>n2,n1
        else {
            max=num3;
            if (num1>=num2){
                mid=num1;
                min=num2;
            }else {
                mid=num2;
                min=num1;
            }
        }
        //Display result
        // Output the sorted numbers in descending order
        System.out.println("Sorted numbers in descending order: " + max + " " + mid + " " + min);
    }
}
