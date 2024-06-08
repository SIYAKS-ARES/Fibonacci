package Orneklerim;

import java.util.Scanner;

public class EnBuyukSayiBulma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üç Sayı Giriniz:");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if (a<=b&&c<=b){
            System.out.print("En büyük sayı: " + b);
        } else if (b<=a&&c<=a) {
            System.out.print("En büyük sayı: " + a);
        }
        else{
            System.out.println("En büyük sayı: " + c);
        }
        scanner.close();
    }
}
