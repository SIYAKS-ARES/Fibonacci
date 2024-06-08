package Denemeler;

import java.util.Scanner;

public class Ozgur2 {
    /*klavyeden girilen stringlerin küçük karakterleri hariç diğer tüm karakterlerinin sayısını ekrana yazdıran java programı
    (a.charAt(x)>'a'&&a.charAt(x)<'z')*/
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println(
                "Küçük karakterleri hariç diğer tüm karakterlerinin sayısını ekrana yazdırmak istediğiniz kelimeyi girin.");
        String a = imput.nextLine();
        int sayac = 0;
        // foaSDFHSD!'^+!342
        for (int j = 0; j < a.length(); j++) {
            if (!(a.charAt(j) >= 'a' && a.charAt(j) <= 'z')) {
                sayac++;
            }
        }
        System.out.println(sayac);
        imput.close();
    }
}
