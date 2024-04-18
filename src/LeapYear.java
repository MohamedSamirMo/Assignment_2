import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter You Year");

        int year=scanner.nextInt();
        // when run code problem enter 1500 to solve if condition year<1582 1500 leaf year
        if(year<1582 && year%4==0){
            System.out.println(year +" is a leap year");
        }
        // if condition to solve leap year or not
        else if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year +" is a leap year");
        }else {
            System.out.println(year +" is not a leap year");
        }


    }
}