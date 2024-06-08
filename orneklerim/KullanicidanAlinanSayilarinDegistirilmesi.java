package Orneklerim;

import java.util.Scanner;

public class KullanicidanAlinanSayilarinDegistirilmesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int birinci_sayi = scanner.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int ikinci_sayi = scanner.nextInt();
        int ucuncu_sayi = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = ucuncu_sayi;

        System.out.println("Birinci sayı: " + birinci_sayi);
        System.out.print("İkinci sayı: " + ikinci_sayi);
        scanner.close();
    }

}
