package Orneklerim;
import java.util.Scanner;
public class Bir_Sayinin_Rakamlari_Toplami {
    public static void main(String[] args) {
        // Girilen sayının rakamlar toplamını bulmaya yarayan program.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen rakamları toplamını bulmak istediğiniz sayıyı giriniz:");
        int sayi = scanner.nextInt();
        int toplam = 0;
        do {
            toplam += sayi % 10;
            sayi = (sayi - (sayi % 10)) / 10;
        } while (sayi > 0);
        System.out.println("Girdiğiniz sayının rakamlar toplamı = " + toplam);
        scanner.close();
    }
}
