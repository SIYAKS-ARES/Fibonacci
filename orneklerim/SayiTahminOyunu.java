package Orneklerim;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[]args){
        Random random = new Random();
        int sayi = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int tahmin = scanner.nextInt();

        while (sayi!=tahmin){
            if (tahmin <0 || tahmin>100){
                System.out.println("Yanlış Girdiniz, sayı 0 ile 100 arasında.");
            }
            else if (sayi<tahmin){
                System.out.println("Daha küçük bir sayı giriniz!");
            }
            else {
                System.out.println("Daha büyük bir sayı giriniz!");
            }
                tahmin = scanner.nextInt();
        }
                System.out.println("Doğru bildiniz, tebrikler!!!");
    }
}
