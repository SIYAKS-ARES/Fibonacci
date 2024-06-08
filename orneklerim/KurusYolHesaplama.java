package Orneklerim;

import java.util.Scanner;

public class KurusYolHesaplama {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız Kilometrede Kaç Kuruş Yakıyor? (Örenek : 0.39):");
        double kurus = scanner.nextDouble();
        System.out.print("Aracınız Kaç Km Yol Aldı?:");
        double km = scanner.nextDouble();
        System.out.print("Toplam Ödemeniz Gereken Tutar " + (kurus*km) + "Tl dir...");
        scanner.close();
    }
}
