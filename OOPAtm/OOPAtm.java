package OOPAtm;

import java.util.Scanner;

public class OOPAtm {

    public void calistirma(Hesap hesap){

        System.out.println("Yazılım Banka Hoşgeldiniz...");
        System.out.println("**************************************");
        System.out.println("Kullanıcı Girişi...");
        System.out.println("**************************************");
        int giris_hakki = 3;

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş Başarılı!");
                break;
            } else {
                System.out.println("Giriş Başarısız!");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Çok fazla yanlış girdiniz. Giriş hakkı kalmadı!\nSistemden çıkılıyor...");
                return;
            }
        }

            System.out.println("*************************************");
            String islemler = """
                    1. İşlem = Bakiye Öğrenme.
                    2. İşlem Para Yatırma.
                    3. İşlem Para Çekme.
                    4. işlem Çıkış.
                    """;
            System.out.print(islemler);
            System.out.println("*************************************");

            label:
            while (true){
                System.out.print("Bir işlem seçiniz: ");
                String islem = scanner.nextLine();
                switch (islem) {
                    case "4":
                        System.out.println("Sistemden çıkılıyor...\nİyi günler dileriz...");
                        break label;
                    case "1":
                        System.out.println("Bakiyeniz: " + hesap.getBakiye());
                        break;
                    case "2":
                        System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                        int yatirilacak_tutar = scanner.nextInt();
                        scanner.nextLine();
                        hesap.paraYatir(yatirilacak_tutar);
                        break;
                    case "3":
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        int cekilecek_tutar = scanner.nextInt();
                        scanner.nextLine();
                        hesap.paraCek(cekilecek_tutar);
                        break;
                    default:
                        System.out.println("Geçersiz işlem...\nLütfen 1,2,3,4 işlemlerden biriniz seçiniz...");
                        break;
                }
            }

        }
        public void calistirma2(Hesap hesap2){

        Login login2 = new Login();

        int giris_hakki = 3;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            
            if (login2.login(hesap2)) {
                System.out.println("Giriş Başarılı!");
                break;
            } else {
                System.out.println("Giriş Başarısız!");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı: " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Çok fazla yanlış girdiniz. Giriş hakkı kalmadı!\nSistemden çıkılıyor...");
                return;
            }
        }

            System.out.println("*************************************");
            String islemler = """
                    1. İşlem = Bakiye Öğrenme.
                    2. İşlem Para Yatırma.
                    3. İşlem Para Çekme.
                    4. işlem Çıkış.
                    """;
            System.out.print(islemler);
            System.out.println("*************************************");

            label:
            while (true){
                System.out.print("Bir işlem seçiniz: ");
                String islem = scanner.nextLine();
                switch (islem) {
                    case "4":
                        System.out.println("Sistemden çıkılıyor...\nİyi günler dileriz...");
                        break label;
                    case "1":
                        System.out.println("Bakiyeniz: " + hesap2.getBakiye());
                        break;
                    case "2":
                        System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                        int yatirilacak_tutar = scanner.nextInt();
                        scanner.nextLine();
                        hesap2.paraYatir(yatirilacak_tutar);
                        break;
                    case "3":
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        int cekilecek_tutar = scanner.nextInt();
                        scanner.nextLine();
                        hesap2.paraCek(cekilecek_tutar);
                        break;
                    default:
                        System.out.println("Geçersiz işlem...\nLütfen 1,2,3,4 işlemlerden biriniz seçiniz...");
                        break;
                }
            }

    }

}


