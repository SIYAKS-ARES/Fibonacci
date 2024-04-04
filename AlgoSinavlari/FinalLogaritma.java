package AlgoSinavlari;
import java.util.Scanner;
public class FinalLogaritma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a ve b sayılarını giriniz.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sonuc = Math.log10(b) / Math.log10(a);
        System.out.println("Sonuç :" + sonuc);
    }
}
