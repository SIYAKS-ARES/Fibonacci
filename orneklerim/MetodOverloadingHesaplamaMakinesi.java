package Orneklerim;

import java.util.Scanner;

public class MetodOverloadingHesaplamaMakinesi {

    static int toplam = 0;
    static int fark = 0;

    public static int toplama (int a, int b){
        toplam = a + b;
        return toplam;
    }
    public static int toplama (int a, int b, int c){
        toplam = a + b + c;
        return toplam;
    }
    public static int fark (int a, int b){
        fark = a - b;
        return fark;
    }
    public static int fark (int a, int b, int c){
        fark = a - b - c;
        return fark;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String islemler = """
                    1. İşlem : İki Sayının Toplanması
                    2. İşlem : Üç Sayının Toplanması
                    3. İşlem : İki Sayının Farkının Alınması
                    4. İşlem : Üç Sayının Farkının Alınması""";
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");

        System.out.print("Lütfen bir işlem seçiniz: ");
        int secilen = scanner.nextInt();
        switch (secilen){
            case 1 ->{
                System.out.print("Birinci sayıyı giriniz: ");
                int birinci_sayi = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int ikinci_sayi = scanner.nextInt();
                System.out.println("İşlem sonucu: " + toplama(birinci_sayi,ikinci_sayi));
            }
            case 2 ->{
                System.out.print("Birinci sayıyı giriniz: ");
                int birinci_sayi = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int ikinci_sayi = scanner.nextInt();
                System.out.print("Üçüncü sayıyı giriniz: ");
                int ucuncu_sayi = scanner.nextInt();
                System.out.println("İşlem sonucu: " + toplama(birinci_sayi,ikinci_sayi,ucuncu_sayi));
            }
            case 3->{
                System.out.print("Birinci sayıyı giriniz: ");
                int birinci_sayi = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int ikinci_sayi = scanner.nextInt();
                System.out.println("İşlem sonucu: " + fark(birinci_sayi,ikinci_sayi));
            }
            case 4 ->{
                System.out.print("Birinci sayıyı giriniz: ");
                int birinci_sayi = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int ikinci_sayi = scanner.nextInt();
                System.out.print("Üçüncü sayıyı giriniz: ");
                int ucuncu_sayi = scanner.nextInt();
                System.out.println("İşlem sonucu: " + fark(birinci_sayi,ikinci_sayi,ucuncu_sayi));
            }
        }
        scanner.close();
    }
}
