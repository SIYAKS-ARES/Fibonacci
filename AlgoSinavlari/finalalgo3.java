package AlgoSinavlari;

import java.util.Scanner;

public class finalalgo3 {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Mesajınız: ");
        String mesaj = giris.nextLine();
        System.out.print("Kac kez yazdırılacak: ");
        int n = giris.nextInt();
        mesajYazdir(mesaj, n, "\n");
        giris.close();
    }

    public static void mesajYazdir(String yazi, int sayi , String opt) {
        for(int i = 0; i < sayi; i++) {
            System.out.print(yazi + opt);
        }
    }
}

