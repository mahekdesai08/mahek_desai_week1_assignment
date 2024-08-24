package Xenosis_Internship.Assignment1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Addition of two number is : "+(num1 + num2));
        System.out.println("Subtraction of two number is : "+(num1 - num2));
        System.out.println("Multiplication of two number is : "+(num1 * num2));
        System.out.println("Division of two number is : " +(num1 / num2));

    }

}
