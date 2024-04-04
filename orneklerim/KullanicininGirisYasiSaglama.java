package Orneklerim;

import java.util.Scanner;

public class KullanicininGirisYasiSaglama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz!:");
        int yas = scanner.nextInt();

        if (yas>=18){
            System.out.print("Giriş Yapabilirsiniz!!!");
        }
        else
            System.out.print("Giriş Yapamazsınız!!!");
    }
}
