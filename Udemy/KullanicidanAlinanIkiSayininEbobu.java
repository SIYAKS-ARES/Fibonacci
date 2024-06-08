package Udemy;

import java.util.Scanner;

public class KullanicidanAlinanIkiSayininEbobu {

    public static int ebobBulma (int sayi1 , int sayi2){

        int ebob = 1;
        for (int i = 1 ; i <= sayi1 && i <= sayi2 ; ++i){
            if ((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob = i;

            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int birinci_sayi = scanner.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int ikinci_sayi = scanner.nextInt();

        System.out.println("Girilen iki sayının ebobu: " + ebobBulma(birinci_sayi, ikinci_sayi));
        scanner.close();
    }
}
