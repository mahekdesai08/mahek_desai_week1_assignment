package Xenosis_Internship.Assignment1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n=2;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }

}
