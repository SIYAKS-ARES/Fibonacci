package Orneklerim;

import java.util.Scanner;

public class kullanicigirisi {

    public static void main(String[] args){
        String pass = "0542";
        int sayac = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen parolanızı giriniz:");
        while (true) {
            String userpass = scanner.nextLine();
            if (userpass.equals(pass)) {
                System.out.println("Giriş Başarılı!");
                break;
            }
            else {
                System.err.println("Giriş Başarısız!\n" + "Kalan deneme hakkınız:" + --sayac);
                if (sayac == 0) {
                    System.err.println("Sistemden Çıkılıyor!");
                    break;
                }
            }
            System.err.print("Lütfen şifrenizi tekrar giriniz:");
        }
        scanner.close();
    }
}
