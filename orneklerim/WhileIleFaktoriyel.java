package Orneklerim;

import java.util.Scanner;

public class WhileIleFaktoriyel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen faktöriyelini bulmak istediğiniz sayıyı giriniz: ");
        long n = scanner.nextInt();
        long faktoriyel = 1;

        while (n > 0){
            faktoriyel *= n;
            n --;
        }
        System.out.println("Girilen sayının faktöriyeli: " + faktoriyel);
    }
}
