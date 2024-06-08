package AlgoSinavlari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finalalgo5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        boolean tamamMi;

        tamamMi = true;
        do {
            try {
                System.out.println("Bir tam sayı giriniz: ");
                int sayi = giris.nextInt();

                System.out.println("Girilen sayi " + sayi + " dir.");

                tamamMi = false;
            }

            catch (InputMismatchException ex) {
                System.out.println("Tekrar deneyin. (Gecersiz giris:" +
                        " bir tam sayi gerekiyor)");
                giris.next();
            }

        } while (tamamMi);

        giris.close();
    }

}

