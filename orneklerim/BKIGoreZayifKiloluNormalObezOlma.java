package Orneklerim;

import java.util.Scanner;

public class BKIGoreZayifKiloluNormalObezOlma {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        int kilo = scanner.nextInt();
        System.out.print("Lütfen Boyunuzu giriniz(Örnek:1,72):");
        double boy = scanner.nextDouble();

        double bki = kilo/(boy*boy);
         if (bki<18.5){
             System.out.println("Zayıfsınız, bki:" + bki);
        } else if (bki>18.5&&bki<25) {
             System.out.println("Normalsiniz, bki:" + bki);
         } else if (bki>25&&bki<30) {
             System.out.println("Kilolusunuz, bki:" + bki);
         }
         else {
             System.out.println("Obezsiniz, bir doktara görğnmenizde fayda var. bki:" + bki);
         }
        scanner.close();
    }
}
