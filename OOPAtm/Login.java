package OOPAtm;

import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        String kullanici = scanner.nextLine();
        System.out.print("Lütfen parolanızı giriniz: ");
        String parola = scanner.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean login2(Hesap hesap2) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        String kullanici = scanner.nextLine();
        System.out.print("Lütfen parolanızı giriniz: ");
        String parola = scanner.nextLine();

        if (hesap2.getKullanici_adi().equals(kullanici) && hesap2.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
}
