package Orneklerim;

import java.util.Scanner;

public class Bir_Sayinin_Rakamlari_Toplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen rakamları toplamını bulmak istediğiniz sayıyı giriniz: ");
        String input = scanner.nextLine();
        int toplam = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                toplam += Character.getNumericValue(c);
            }
        }

        System.out.println("Girdiğiniz sayının rakamlar toplamı = " + toplam);
        scanner.close();
    }
}
