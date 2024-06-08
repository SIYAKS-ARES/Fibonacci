package Orneklerim;

import java.util.Scanner;

public class TestMesaj {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Mesajiniz: ");
        String msj = klavye.nextLine();
        System.out.print("Kac kez yazdirilsin: ");
        int n = klavye.nextInt();
        System.out.print("Alt alta yazsin mi (E/H): ");
        Scanner scanner = new Scanner(System.in);
        char secme = scanner.next().charAt(0);
        scanner.close();
        char tercih = secme;
        if (tercih == 'E' || tercih == 'e')
            mesajYazdir(msj, n, " \n");
        else
            mesajYazdir(msj, n, " \t");
        klavye.close();
    }

    public static void mesajYazdir(String text, int basla, String secme) {

        for (int indeks = basla; indeks > 0; indeks--)
            System.out.print((basla - indeks + 1) + "-" + text + secme);
    }
}