package Orneklerim;

import java.util.Scanner;

public class GirilenSayininArmstrongOlupOlmamaDurumunuKontrol {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz tam sayıyı giriniz:");
        int armstrng = scanner.nextInt();
        System.out.print("Basamak sayısı: ");
        int basamak = scanner.nextInt();
        int gecici_sayi = armstrng;
        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi%10;
            gecici_sayi /=10;
            toplam += Math.pow(basamak_degeri,basamak);

        }while (gecici_sayi>0);

        if (armstrng == toplam) {
            System.out.println("Girdiğiniz sayı bir Armstrong sayısıdır...");

        }else {
            System.err.println("Girdiğiniz sayı bir Armstrong sayısı değildir...");
        }
        scanner.close();
    }
}
