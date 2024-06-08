package Udemy;

import java.util.Scanner;

public class MetodlarILeHesapMakinesi {
    public static int cikarma (int a, int b){
        return (a -  b);
    }
    public static double bolme (int a, int b){
        return ((double) a / b);
    }
    public static int toplama (int a, int b){
        return (a + b);
    }
    public static int toplama (int a, int b, int c){
        return (a + b + c);
    }
    public static int carpma (int a, int b){
        return (a * b);
    }
    public static int carpma (int a, int b, int c){
        return (a * b * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = """
                1. işlem toplama,
                2. işlem çıkarma,
                3. işlem çarpma,
                4. işlem bölme,
                Çıkış için q'ya basınız.""";
        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");

        while (true) {
            System.out.print("Lütfen bir işlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kaç değer toplamak istiyorsunuz?(2 veya 3): ");
                int deger_sayisi = scanner.nextInt();

                if (deger_sayisi == 2) {
                    System.out.print("Birinci sayıyı giriniz: ");
                    int birinci_sayi = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    int ikinci_sayi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İşleminizin sonucu: " + toplama(birinci_sayi, ikinci_sayi));
                } else if (deger_sayisi == 3) {
                    System.out.print("Birinci sayıyı giriniz: ");
                    int birinci_sayi = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    int ikinci_sayi = scanner.nextInt();
                    System.out.print("Üçüncü sayıyı giriniz: ");
                    int ucuncu_sayi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İşleminizin sonucu: " + toplama(birinci_sayi, ikinci_sayi, ucuncu_sayi));
                } else {
                    System.out.println("Bunun için uygun metod bulunmuyor!");
                }
            } else if (islem.equals("2")) {
                System.out.print("Birinci sayıyı giriniz: ");
                int birinci_sayi = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int ikinci_sayi = scanner.nextInt();
                System.out.println("İşleminizin sonucu: " + cikarma(birinci_sayi, ikinci_sayi));
            } else if (islem.equals("3")) {
                System.out.print("Kaç değer çarpmak istiyorsunuz?(2 veya 3): ");
                int deger_sayisi = scanner.nextInt();

                if (deger_sayisi == 2) {
                    System.out.print("Birinci sayıyı giriniz: ");
                    int birinci_sayi = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    int ikinci_sayi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İşleminizin sonucu: " + carpma(birinci_sayi, ikinci_sayi));
                } else if (deger_sayisi == 3) {
                    System.out.print("Birinci sayıyı giriniz: ");
                    int birinci_sayi = scanner.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    int ikinci_sayi = scanner.nextInt();
                    System.out.print("Üçüncü sayıyı giriniz: ");
                    int ucuncu_sayi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("İşleminizin sonucu: " + carpma(birinci_sayi, ikinci_sayi, ucuncu_sayi));
                } else {
                    System.out.println("Bunun için uygun metod bulunmuyor!");
                }
            } else if (islem.equals("4")) {
                System.out.print("Birinci sayıyı giriniz: ");
                int birinci_sayi = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int ikinci_sayi = scanner.nextInt();
                System.out.println("İşleminizin sonucu: " + bolme(birinci_sayi, ikinci_sayi));
            } else {
                System.out.println("Geçersiz işlem!");
            }
        }
        scanner.close();
    }
    }

