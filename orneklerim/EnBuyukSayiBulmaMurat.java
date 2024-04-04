package Orneklerim;

import java.util.Scanner;

public class EnBuyukSayiBulmaMurat {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz:");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        int b = scanner.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz:");
        int c = scanner.nextInt();
        int maks = -1;

        if (a>=b&&a>=c){
            maks = a;
        } else if (b>=a&&b>=c) {
            maks =b;
        }
        else {
            maks = c;
        }
        System.out.print("En Büyük Sayı: " + maks);
    }
}
