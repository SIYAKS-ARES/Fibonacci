package Orneklerim;

import java.util.Scanner;

public class DikÜçgeninHipotenüsünüBulma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzun dik kenarı giriniz:");
        int a = scanner.nextInt();
        System.out.print("Kısa dik kenarı giriniz:");
        int b = scanner.nextInt();
        double h = Math.sqrt(a*a+b*b);
        System.out.println("Üçgeninizin hipotenüsü:" + h );
    }
}
