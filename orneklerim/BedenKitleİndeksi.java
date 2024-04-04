package Orneklerim;

import java.util.Scanner;

public class BedenKitleİndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz:");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu Giriniz (Örnek : 1.72):");
        double boy = scanner.nextDouble();
        double bki = kilo / (boy*boy);
        System.out.print("Beden Kitle İndeksiniz:" + bki);

    }
}