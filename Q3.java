package Xenosis_Internship.Assignment1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter case : ");
        System.out.println("Select any one operation which you want to perform : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modules");
        for (int i = 0; i < 5; i++) {
            int cases = sc.nextInt();
            switch (cases) {
                case 1:
                    System.out.println("Sum of two numbers : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication : " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division : " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Modules : " + (num1 % num2));
                    break;
                case 6:
                    return;
            }
        }
    }
}
