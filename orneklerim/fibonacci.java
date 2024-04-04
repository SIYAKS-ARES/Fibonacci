package Orneklerim;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç dizin istiyorsunuz?: ");
        int n = scanner.nextInt();
        int a = 1,
                b=1,
                result;
        System.out.print(a+", " +b);
        for (int i =0 ; i<n; i++) {
            result = a+b;
            a=b;
            b=result;
            System.out.print(", "+ result );
            System.out.print("");
        }
        }
    }

